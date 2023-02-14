package com.DSA;

import java.util.Arrays;

public class RoateArray {
	
	 static void rotateArr(int arr[], int d, int n)
	    {
	       int narr[]  = new int[n];
	       int k=0;
	       for (int i = d; i < n; i++) {
	    	   narr[k++] = arr[i];
	       }
	       System.out.println(k);
	       
	       for (int i = 0; i < d; i++) {
			narr[k++] =arr[i];
		}
	       System.out.println(Arrays.toString(narr));
	       
	    }
	 
	 static void rotateArr2(int arr[], int d, int n) {
		 reverse(arr, 0, n-1);
//		 System.out.println(Arrays.toString(arr));
		 reverse(arr, 0, n-1-d);
//		 System.out.println(Arrays.toString(arr));
		 reverse(arr, n-d, n-1);
//		 reverse(arr, n-d+1, n);
	 }
	 
	 static void reverse(int arr[],int start, int end) {
		 
		 while (start<end) {
			 int temp = arr[start];
			 arr[start] = arr[end];
			 arr[end] = temp;
			 start++;
			 end--;
		}
		 
		
	 }
	 

	 
	 public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int D = 2;
		int n= arr.length;
		System.out.println(Arrays.toString(arr));
//		reverse(arr,0,n);
//		System.out.println(Arrays.toString(arr));
//		rotateArr(arr, D, n);
		rotateArr2(arr, D, n);
		System.out.println(Arrays.toString(arr));
	

	}

}
