package TreeTestingEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class revArray {
	
//	public static void rev(int[] arr, int num) {
//		int j = arr.length;
//		int[] rev = new int[j];
//		int temp = 0;
//		for (int i = num; i < rev.length/2; i++) {
//			temp  = arr[i];
//			arr[i] = arr[j-i-1];
//			arr[j-i-1] = temp;
//
//		}
//		System.out.println(Arrays.toString(arr));
//	}
	
	public static void main(String[] args) {
		Integer[] arr = {2,3,5,6,2,13};
//		rev(arr);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
		int n = arrayList.size();

		int index = 2;
		// Declare two pointers.
		int i =	index  + 1;
		int j = n - 1;

		// Till the i<j condition holds swap the elements.
		while (i < j) {
			Collections.swap(arrayList, i, j);
			i++;
			j--;
		}

		
		System.out.println(arrayList);
	}

}
