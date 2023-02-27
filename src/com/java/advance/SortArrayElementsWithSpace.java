package com.java.advance;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayElementsWithSpace {

//	T t;

	public static <T> void sortArrayElements(String arr[]) {
		String temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
	}

	public static boolean isNumeric(String s) {
		boolean f = false;
		if (s != null) {
			try {
				double num = Double.parseDouble(s);
				f = true;

			} catch (Exception e) {

			}
		}

		return f;
	}

	public static int getSumOfNumbers(String str) {
		int sum = 0;
		String[] split = str.split("\\s");
		for (String string : split) {
			if (isNumeric(string)) {
				sum+=Double.parseDouble(string);
			}
		}

		return sum;
	}

	public static void main(String[] args) {
//		String arr[] = {"Raaj", "raaj", "rAaj","RA Aj"};
//		Integer arr2[] = {3,4,67,34,23,89,6,2};
////		sortArrayElements(arr2);
//		Arrays.sort(arr2);
//		System.out.println(Arrays.toString(arr2));
////		Collections.sort(Arrays.asList(arr));
//		sortArrayElements(arr);
//		System.out.println(Arrays.toString(arr));
		String s = "15 Nasser 4 Khan asdf 20";
		System.out.println(getSumOfNumbers(s));
		System.out.println("My name is \"Nasser Khan\" ");
	}
}
