package com.Collections;

import java.util.Arrays;
import java.util.Iterator;

public class GetIntercection {

	public static String getIntercection(String[] arr, String[] arr2) {
		String u[] = new String[arr.length+arr.length];
		System.out.println("working");
//		System.out.println(string.strip()); its a java 11 method use trim instead
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].trim().toUpperCase().equals(arr2[j].trim().toUpperCase())) {
					u[i] = arr[i];
				}
			}
		}
		System.out.println(Arrays.toString(u));

		return "";
	}
	
	public static void getUnigq(String[] arr, String[] arr2) {
		String u[] = new String[15];
		int i,j;
		for (i = 0; i < arr.length; i++) {
			u[i] = arr[i];
		}
		j= i;
		for (i = 0; i < arr2.length; i++) {
			int c=0;
			for (int k = 0; k < j-1; k++) {
				if (arr2[i].trim().toUpperCase()== u[k].trim().toUpperCase()) {
					c++;
				}
				
			}
			if (c==0) {
				u[j++] = arr2[i];
			}
			
		}
		System.out.println(Arrays.toString(u));
		
	}

	public static void main(String[] args) {
		String arr[] = { "Nasser Khan", "Mohit Sharma", "Rohit", "Steve", "Hamda  " , "raDHika"};
		String arr2[] = { "Zoya Khan", "mohit Sharma", "Rohit", "Steve", "Hamda", "Radhika" };
//		getIntercection(arr, arr2);
//		int[] arr3 = {};

//		System.out.println(arr3.length);
//		System.out.println(Arrays.toString(arr3));
//		getUnigq(arr, arr2);
//		int a= 6;
//		int z= ++a;
//		System.out.println(z);
//		System.out.println(++a);
	}
}
