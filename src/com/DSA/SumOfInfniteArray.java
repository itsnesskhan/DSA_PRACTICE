package com.DSA;

import java.util.Arrays;

public class SumOfInfniteArray {

// Function to find the sum of elements
// in a given range of an infinite array
	static void rangeSum(int arr[], int N, int L, int R) {

		int[] sumArray = new int[N+1];
		
		for (int i = 1; i <=N; i++) {
			sumArray[i] = sumArray[i-1]+ arr[i-1];
		}
		
		int leftSum = ((L-1)/N)*sumArray[N]+ sumArray[(L-1)%N];
		int rightSum = (R/N)*sumArray[N]+sumArray[R%N];
		System.out.println(rightSum-leftSum);
		
		System.out.println(Arrays.toString(sumArray));
	}

// Driver Code
	public static void main(String[] args) {
		int arr[] = { 5, 2, 6, 9 };
		int L = 2, R = 4;
		int N = arr.length;
		rangeSum(arr, N, L, R);

	}
}

// This code is contributed by shivanisinghss2110
