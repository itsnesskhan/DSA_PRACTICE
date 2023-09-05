package DistintPairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.net.ssl.SSLContext;

import DistintPairs.Pair.Solution;

public class DistPairsEx {

//	public static int getPairs(int[] arr, int k) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[j]- arr[i] == k) {
//					System.out.println("pair ("+arr[i]+" ,"+arr[j]+" )");
//				}
//			}
//		}
//		return 0;
//	}

	public static int getPairs(int[] arr, int k) {
		ArrayList<Pair> set = new ArrayList<>();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			int binarySearch = Arrays.binarySearch(arr, i + 1, arr.length, k-arr[i]);
			System.out.println( binarySearch);
			if (binarySearch >0) {
			set.add(new Pair(arr[i], arr[binarySearch]));
			System.out.println("pair ("+arr[i]+" ,"+ arr[binarySearch] +" )");
			}
			// in nlog(n) time complacity
			// one issue with that approch is that it might return duplicate element
			//right eauls and hash method problem solved
		}
//		Collections.binarySearch(, null)
		new ArrayList<>();
		System.out.println(set);
		return 0;
	}
	
	public static int findPairs(int[] arr, int k) {
		int count=0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int b= k-arr[i];
			if (map.containsKey(b)) {
				count+=map.get(b);
			}
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		ArrayList<Pair> list = new ArrayList<>();
		Set<Integer> keySet = map.keySet();
		for (Integer i : keySet) {
			if (map.containsKey(k-i) && k-i==i) {
				Integer integer = map.get(k-i);
				while (integer>0) {
					list.add(new Pair(i, i));
					integer--;
				}
			}
			
			else if (map.containsKey(k-i)) {
				list.add(new Pair(i,(k-i)));
			}
		}
		System.out.println(list);
		return count;
	}

	public static void main(String[] args) {
		int arr[] = {1,7,5,1


};
		int k = 6;
//		getPairs(arr, k);
		int findPairs = findPairs(arr, k);
//		System.out.println(findPairs);
		
		List<Integer> of = List.of(-9, 3 ,-2 ,8 ,-3, 4 
) ;     
		
		
//		Solution.twoSum(of, 16, 6);
		
		
//		getPairs(arr, k);
//		findPairs(arr, k);

	}

}

class Pair {
	int a;
	int b;

	public Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "("+a +"," +b+ ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, b);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		return a == other.a && b == other.b;
	}
	
	class Solution {
		static List<Integer> twoSum(List<Integer> arr, int target, int n) {
//	       ArrayList<Pair<Integer,Integer>> list = new ArrayList<Pair<Integer,Integer>>();
	       HashMap<Integer, Integer> map = new HashMap<>();
	        for (int i : arr) {
	            if (map.containsKey(i)) {
	                map.put(i, map.get(i)+1);
	            }else {
	                map.put(i, 1);
	            }
	        }  
	        System.out.println(map);
	        for(int i: map.keySet()){
	            if(target>0 && map.containsKey(target-i)){
//	                Pair<Integer,Integer> pair = new Pair<>(i,target-i);
//	                list.add(pair);
	            }else
	            if(target==0 && map.get(i)>1){
//	                Pair<Integer,Integer> pair = new Pair<>(i,i);
//	                list.add(pair);
	            }

	            
	        }
//	        if(list.size() == 0){
//	            list.add(new Pair<>(-1,-1));
//	        }
	       return null;
		}
	}
}

	
	


