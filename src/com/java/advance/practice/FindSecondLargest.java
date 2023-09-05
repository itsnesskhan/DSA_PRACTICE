package com.java.advance.practice;

import java.util.Arrays;

public class FindSecondLargest {
	
	public static int secondLargest(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for (int i = arr.length-1; i >1; i--) {
			if (arr[i]!=arr[i-1]) {
				return arr[i-1];
			}
		}
		return 0;
	}
	
	public static int secondLargestCustomSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		for (int i = arr.length-1; i >1; i--) {
			if (arr[i]!=arr[i-1]) {
				return arr[i-1];
			}
		}
		return 0;
	}
	
	public static int findSecondLargestOptimized(int[] arr) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for (int i : arr) {
			if(i>first) {
				second = first;
				first = i;
			}
			else if(i>second) {
				second = i;
			}
		}
		return second;
	}

	public static void main(String[] args) {
		int arr[] = {10,2,3,4,5,3,4,9,10};
		System.out.println(Arrays.toString(arr));
//		System.out.println(secondLargestCustomSort(arr));
		System.out.println(findSecondLargestOptimized(arr));
	}
}
