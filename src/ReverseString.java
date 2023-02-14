import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "this is my java string reverse";
		String revString = "";
		char[] arr = s1.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			revString= arr[i]+revString;
		}
		System.out.println(revString);
	}

}
