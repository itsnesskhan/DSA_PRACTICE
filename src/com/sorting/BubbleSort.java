package com.sorting;

import java.util.Arrays;

public class BubbleSort{
	
	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
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
		System.out.println(Arrays.toString(bubbleSort(arr)));
		
	}
}
