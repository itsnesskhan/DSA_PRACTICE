package com.DSA;

import java.util.Arrays;

public class SortArrayOf012 {
	
	public static void swap(int item1, int item2, int arr[]) {
		int temp= arr[item2];
		arr[item2] = arr[item1];
		arr[item1] = temp;
	}
	
	public static void sort(int[] arr) {
		int zeroIdx= 0;
		int midInx =0;
		int twoIdx= arr.length-1;
		while(midInx<=twoIdx) {
			
			if (arr[midInx]== 0) {
				swap(midInx, zeroIdx, arr);
				zeroIdx++;
				midInx++;
			}
			else
			if (arr[midInx]==1) {
				midInx++;
			}
			else {
				swap(midInx, twoIdx, arr);
				twoIdx--;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,};
		System.out.println(Arrays.toString(nums));
		sort(nums);
		System.out.println(Arrays.toString(nums));
		

	}

}
