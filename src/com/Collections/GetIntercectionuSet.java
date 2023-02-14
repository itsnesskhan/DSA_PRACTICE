package com.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GetIntercectionuSet {

	public static void getUnion(Integer arr[], Integer arr2[]) {
		Set<Integer> set = new HashSet<>(Arrays.asList(arr));
		for (Integer integer : arr2) {
			set.add(integer);
		}
		System.out.println(set);

	}
	
	public static void getIntersection(Integer arr[], Integer arr2[]) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
		System.out.println("set1 "+set1);
		System.out.println("set2 "+set2);
//		for (Integer integer : set1) {
//			if (!set2.contains(integer)) {
//				System.out.print(integer+" ,");
//				
//			}
//		}
		set1.retainAll(set2);   //only take value that present in first array
		System.out.println(set1);  
	}

	public static void main(String[] args) {
		Integer arr[] = { 45, 66, 67, 34, 23, 67,98,56,45 };
		Integer arr2[] = { 45, 66, 34, 67, 97, 45, 23, 34 };
		getIntersection(arr, arr2);
		getUnion(arr, arr2);
		

	}
}
