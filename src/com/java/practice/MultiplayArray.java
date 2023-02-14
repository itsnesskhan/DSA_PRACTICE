package com.java.practice;


public class MultiplayArray {
	public static void main(String [] args) {
		int[] arr1 = {3,5,6,8,2};
		int[] arr2 = {5,7,3,7,2};
		int[] arr3 = new int[5];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i]*arr2[i];
			
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}
	
}
