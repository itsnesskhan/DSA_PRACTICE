import java.nio.channels.ClosedByInterruptException;
import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
	public static boolean isAnagram(String first, String second) {
		System.out.println(first);
		System.out.println(second);
		boolean status = true;
		if (first.length() != second.length()) {
			status = false;
			return status;
		}
		else{
			char[] s1 = first.toCharArray();
			char[] s2 = second.toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			status = Arrays.equals(s1, s2);
			System.out.println(status);
		}
		return status;
	}

	public static void main(String[] args) {
		String first, second;
		System.out.println("Enter first String");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter second String");
		first = scanner.nextLine().replaceAll("\\s","");
		second = scanner.nextLine().replaceAll("\\s","");
		System.out.println(isAnagram(first, second));
	}

}
