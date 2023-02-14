import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StringOccurance {
	public static int findOccurance(String[] srr, String inpuString) {
		int count = 0;
		for (int i = 0; i < srr.length; i++) {
			if (inpuString.equals(srr[i])) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s1 = "this is i am not sure how works, but i will do it works anyway";
		String[] srr = s1.split("[\\s,]"); // if there is two conditon u wann aapply
		System.out.println(Arrays.toString(srr));
		System.out.println(srr[7]);
		Scanner scanner = new Scanner(System.in);
		List<Integer> integers = List.of(12, 45,6,54,6,34,45,45,12);
		String inputString = scanner.next();
		System.out.println(s1.indexOf(inputString));
		System.out.println(inputString+" occure "+findOccurance(srr, inputString)+" times");
		System.out.println(Collections.frequency(integers, 45));
		
	}

}
