package com.java.practice.takeMahindra;

import java.util.HashSet;

public class PrintFirstDublicate {
	
	public static void printFirstDublicate(int arr[]) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]==arr[j]) {
					System.out.println(arr[i]);
					flag = true;
					break;
				}
				if (flag) {
					break;
				}
			}
		}
	}
	
	private static void printFirstDublicate2(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				System.out.println(arr[i]);
				break;
			}
			set.add(arr[i]);
		
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {10,5,3,4,5,3,5};
		printFirstDublicate(arr);
		printFirstDublicate2(arr);
	}

	
}
