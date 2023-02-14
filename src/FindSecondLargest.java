import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSecondLargest {

	private static int findSecondHighest(Integer[] array) {
		int highest = Integer.MIN_VALUE;
		System.out.println("highest"+highest);
		int secondHighest = Integer.MIN_VALUE;
		System.out.println(secondHighest);

		for (int i : array) {
			if (i > highest) {
				secondHighest = highest;
				highest = i;
			} else if (i > secondHighest) {
				secondHighest = i;
			}

		}
		return secondHighest;
	}
	
	public static void findSecondLarge(Integer[] arr) {
		
	}
	
	
	public static void main(String[] args) {
		Integer[] arr = {14,99,5,6,23,78,89,99};
		Set<Integer> set = new HashSet<>(Arrays.asList(arr));
		Integer arr1[]= new Integer[set.size()];
		Arrays.sort(arr1);
		set.toArray(arr1);
		
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(findSecondHighest(arr1));
	}

}
