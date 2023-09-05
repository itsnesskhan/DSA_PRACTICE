package com.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int smallest = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[smallest]>arr[j]) {
					smallest = j;
				}
			}
			swap(arr, smallest, i);
		}
		return arr;
	}
	
	
	
	public static void swap(int[] arr, int start, int end) {
		int temp = arr[end];
		arr[end] = arr[start];
		arr[start] = temp;
	}

	
	public static void main(String[] args) {
		int arr[] = {3,5,7,8,2,4};
		System.out.println(Arrays.toString(selectionSort(arr)));
		
	}

}
