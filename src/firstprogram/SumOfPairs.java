package firstprogram;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfPairs {
	public static int[][] pairSum(int[] arr, int s) {
		ArrayList<int[]> arrayList = new ArrayList<int[]>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == s) {
					int[] pairs = new int[2];
					pairs[0] = arr[i];
					pairs[1] = arr[j];
					arrayList.add(pairs);
				}
			}
		}

		int[][] arr2 = new int[arrayList.size()][2];
		for (int i = 0; i < arrayList.size(); i++) {
			int a = arrayList.get(i)[0];
			int b = arrayList.get(i)[1];
			
			arr2[i][0] = Math.min(a, b);
			arr2[i][1] = Math.max(a, b);

		}
		
		for (int[] is : arr2) {
			System.out.println(Arrays.toString(is));
		}
		Arrays.sort(arr2, new Mycomperator());

		return arr2;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, -4, 7, 9, 2,-2,4,-3 };
		int[][] pairSum = pairSum(arr, 5);
		for (int[] is : pairSum) {
			System.out.println(Arrays.toString(is));
		}
	}

}
