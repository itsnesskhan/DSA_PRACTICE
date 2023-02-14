package com.Collections;

import java.util.Arrays;
import java.util.Scanner;

public class UnionOfArray {

	public static void getUnion(int[] arr, int[] arr2) {
		int u[] = new int[15];
		int i;
		for ( i = 0; i < arr.length; i++) {
			u[i]= arr[i];
		}
		int j= i;
		for (int j2 = 0; j2 < arr2.length; j2++) {
			int c=0;
			for (int k = 0; k < j; k++) {
				if (arr[i] == u[k]) {
					c++;
				}
				if (c==0) {
					u[j++] = arr2[i];
				}
			}
		}
		System.out.println(Arrays.toString(u));
	}

	public static void main(String[] args) {
		int[] arr = {};
		int[] arr2 = {};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of elment in first array");
		int alength = scanner.nextInt();
		arr = new int[alength];
		System.out.println("now inter the "+alength+"elemets = ");
		for (int i = 0; i < alength; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Please enter the number of elment in second  array");
		int blength = scanner.nextInt();
		arr2 = new int[blength];
		System.out.println("now inter the "+blength+" elemnts = ");
		for (int i = 0; i < blength; i++) {
			arr2[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(arr2));
		getUnion(arr, arr2);
	}
}
