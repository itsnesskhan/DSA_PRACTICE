import java.util.Arrays;

public class SumOfSubArrays {
	
	public static int findIndex(int[] array) {
		int leftSum=0;
		int rightSum =0;
		for (int i = 1; i < array.length; i++) {
			leftSum = leftSum(array, i);
			rightSum = rightSum(array, i);
			if (leftSum == rightSum) {
				return i;
			}
			
			
		}
		return 0;
	}
	
	public static int leftSum(int[] array, int index) {
		int leftSum =0;
		for (int i = 0; i <=index-1; i++) {
			leftSum+=array[i];
		}
		return leftSum;
	}
	
	public static int rightSum(int[] array, int index) {
		int rightSum =0;
		for (int i = index+1; i <array.length; i++) {
			rightSum+=array[i];
		}
		return rightSum;
	}
	
	
	
	public static void main(String[] args) {
		int[] array = {8,2,13,21,2,1,2,3,12,3,6,23};
		System.out.println(findIndex(array));
		
		
		
		
		
	}

}
