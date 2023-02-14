package com.Collections;

import java.util.Arrays;

public class CoceptsTesting {

	public static void main(String[] args) {
//		int arr[] = new int[10];
//		for (int i = 0; i < 10; ++i) {
//			arr[i] = i/2;
//			arr[i]++;
//			System.out.print(arr[i]+" ");
//			i++;
//		}
		
		int a[][] = {{1,2,3},
					{4,5,6},
					{7,8,9}
		};
			int sum =0;			
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a.length; ++j) {
				sum+=a[i][j];
			}
		}
		System.out.println(sum/5);
	}
}
