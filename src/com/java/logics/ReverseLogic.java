package com.java.logics;

import java.util.Arrays;

public class ReverseLogic {

	public static int[] reverseWithForLoopNoChangeInExitingArray(int arr[]) {
		int temparray[] = new int[arr.length];
		int j = arr.length -1;
		for(int i=0;i<arr.length;i++) {
			temparray[j--] = arr[i];
		}
		return temparray;
	}
	
	public static void reverseWithForLoopChangeInExitingArray(int arr[]) {
		int j = arr.length -1;
		int temp =0;
		for(int i=0;i<arr.length/2;i++) {
			temp = arr[i];
			arr[i] = arr[j];
		    arr[j--] = temp;
		}
	}
	
	public static void reverseWithWhileLoopChangeInExitingArray(int arr[]) {
		int j = arr.length -1;
		int i = 0;
		int temp =0;
		while(j!=i) {
			temp = arr[i];
			arr[i++] = arr[j];
		    arr[j--] = temp;
		}
	}
	
	public static void reverseWithWhileLoopWithIndex(int arr[], int start, int end) {
		int j = end;
		int i = start;
		int temp =0;
		while(j!=i) {
			temp = arr[i];
			arr[i++] = arr[j];
		    arr[j--] = temp;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {2,5,4,6,8,1};
		int[] reverseWithForLoop = reverseWithForLoopNoChangeInExitingArray(arr);
		System.out.println("actual array "+Arrays.toString(arr));
		System.out.println("reverse array "+Arrays.toString(reverseWithForLoop));
		reverseWithForLoopChangeInExitingArray(arr);
		System.out.println("actual array change for loop "+Arrays.toString(arr));
		System.out.println("actual array change while loop "+Arrays.toString(arr));
		reverseWithWhileLoopWithIndex(arr, 2, 4);
		System.out.println("actual array change with indexes "+Arrays.toString(arr));
		
		
	}
}
