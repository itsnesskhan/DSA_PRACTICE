package com.Collections;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
	public static int[] reverseArray(int[] arr) {
		int b[] = new int[arr.length];
		int j= arr.length;
		for (int i = 0; i < b.length; i++) {
			  b[j-1] = arr[i];
			  j--;
		}
		return b;
	}
	
	public static int[] reverseArraya(int[] arr) {
		int j= arr.length-1;
		for (int i = 0; i < arr.length/2; i++) {
				int temp = arr[j];
			  arr[j] = arr[i];
			  arr[i] = temp;
			  j--;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,56,45,89};
		System.out.println(Arrays.toString(arr));
		int[] reverseArray = reverseArraya(arr);
		System.out.println(Arrays.toString(reverseArray));
//		Collections.reverse(Arrays.as);
	}
}
