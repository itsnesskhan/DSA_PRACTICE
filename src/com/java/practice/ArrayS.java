package com.java.practice;


public class ArrayS {
	public static void main(String []args) {
		int[] arr = {1,354,5,45,76};
		int[] SA = SliceArray(1, 4, arr);
		for(int element:SA) {
			System.out.print(element+" ,");
		}
		System.out.println(SA[SA.length-1]);
		
	}
	
	
	public static int[] SliceArray(int start, int end, int[] arr) {
		int[] SliceArray = new int[end- start];
		for(int i=0; i<SliceArray.length;i++) {
			SliceArray[i] = arr[start+i];
		}
		return SliceArray;
	}
}