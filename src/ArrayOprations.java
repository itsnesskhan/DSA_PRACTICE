import java.util.Arrays;
import java.util.Comparator;

public class ArrayOprations {

	public static void main(String[] args) {
		Integer arr[] = {23,56,13,67,21,8,18,96,53};
		Arrays.sort(arr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr));
		Integer[] copyOf = Arrays.copyOfRange(arr, 1, 3);
//		Integer[] copyOf = Arrays.copyOf(arr, 6);
		
		System.out.println(Arrays.toString(copyOf));
//		int compare = Arrays.compare(arr, copyOf);
		int mismatch = Arrays.mismatch(arr, copyOf);
//		System.out.println(mismatch); they mismatch at 0 indexs
		
		boolean equals = Arrays.equals(arr, copyOf);
		System.out.println(equals);
		
		Student student[] = {new Student(1, "Nasser Khan"),
							new Student(2,"Hamda Pathan"),
							new Student(3, "Zoya Sheikh"),
							new Student(4, "Aayush Kushwah"),
							new Student(4, "Mohit Agarwal")
		};
		System.out.println(Arrays.toString(student));
//		Arrays.sort(student,Comparator.reverseOrder());
		Arrays.sort(student);
		System.out.println(Arrays.toString(student));
		
				
	}
}
