package com.java.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class SortArray {
	public static void sortArray(Integer[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		Integer[] arr = {12,89,45,5,7,89,25,32};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		HashSet<Integer> hashSet = new HashSet<Integer>(Arrays.asList(arr));
		arr = hashSet.toArray(new Integer[hashSet.size()]);
		sortArray(arr);

}

}
