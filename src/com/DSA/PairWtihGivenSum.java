package com.DSA;

import java.util.ArrayList;
import java.util.HashMap;

public class PairWtihGivenSum {
	
	public static ArrayList<ArrayList<Integer>> pairWithGivenSum(int arr[], int sum){
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
	
			ArrayList<Integer> res = new ArrayList<>();
			
			if (map.containsKey(sum-arr[i])) {
				res.add(sum-arr[i]);
				res.add(arr[i]);
				list.add(res);
			}
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		int[] arr= {2,1,3,5,7,8,2,-1};
		int sum = 8;
		ArrayList<ArrayList<Integer>> pairWithGivenSum = pairWithGivenSum(arr, sum);
		System.out.println(pairWithGivenSum);
	}

}
