import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import javax.sound.midi.Soundbank;

class ArrayDuplicate {

	public static void ArraySorting(int[] arr) {

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}
	}

	public static int[] removeDuplicate(int[] arr) {
		int[] arr1 = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr1[j++] = arr[i];
			}

		}
		arr1[j++] = arr[arr.length - 1];

		return arr1;
	}

	public static void main(String[] args) {
		int[] arr = { 13,2, 4, 53, 45, 89, 99, 99 ,89};
		System.out.println("normal array");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		ArraySorting(arr);
		System.out.println("\nsorted array");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\nremoved duplicates");
		int[] myarray = removeDuplicate(arr);
		for (int i : myarray) {
			System.out.print(i + " ");
		}
		System.out.println("\nagain sort");
		ArraySorting(myarray);
		for (int i : myarray) {
			System.out.print(i + " ");
		}
		System.out.println("\nSecond largest element is "+myarray[myarray.length-2]);
		
	}

}