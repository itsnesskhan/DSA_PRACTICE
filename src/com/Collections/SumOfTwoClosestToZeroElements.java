package com.Collections;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthGraphicsUtils;

public class SumOfTwoClosestToZeroElements {
//2,5,7
	public static int getSum(int[] arr) { 
		int mininmum = arr[0]+arr[1];
		int firstIndex =0,secondIndex =1;
		for (int i = 0; i < arr.length; i++) {
			for (int k = i+1; k < arr.length; k++) {
				int sum = arr[i]+arr[k];
				if (Math.abs(sum)<Math.abs(mininmum)) {
					mininmum = sum;
					firstIndex = i;
					secondIndex = k;
				}
			}
		}
		System.out.println("sum is"+ mininmum);
		System.out.println("mininmum numer 1 is"+ arr[firstIndex]);
		System.out.println("minimum number 2 is"+ arr[secondIndex]);
		return 0;
	}

	public static void getSumF(int[] arr) {
		int minimum = arr[0]+arr[0+1];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int binarySearch = Arrays.binarySearch(arr, i+1, arr.length, sum-arr[i] );
			System.out.println(arr[i]+" "+binarySearch);
//			System.out.println(binarySearch);
		}
		
		
	}
	
	public static void main(String[] args) {
		int arr[] = { -2,-3,2,10 };
		Arrays.sort(arr);
		getSum(arr);
		if (-15 < -13) {
			System.out.println("hello");
		}
//		getSum(arr);
	}
}
