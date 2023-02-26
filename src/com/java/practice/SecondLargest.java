package com.java.practice;


public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = {1,4,5,5,34,67,55,67};
		System.out.println(secondLarges(arr));
	}
	
	
	
	public  static int secondLarges(int[] arr) {
		int total = arr.length;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]> arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
		for (int i = total-1; i >= 0; i--) {
			if (arr[i]!= arr[i-1]) {
				return arr[i-1];
			}
		}
		return 0;
		
	}
}
