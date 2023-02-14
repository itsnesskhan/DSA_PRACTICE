import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {
	
	public static void removeDuplicate(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i]==array[j]) {
					System.out.println(array[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String nme="iamnessbakfkkdghhh";
		String newstr="";
		Set<Character> hashSet = new LinkedHashSet<Character>();
		char[] charArray = nme.toCharArray();
		System.out.println(charArray);
		for (char c : charArray) {
			hashSet.add(c);
		}
		
		for (char c :hashSet) {
			newstr+=c;
		}
		System.out.println(newstr);
//		removeDuplicate(nme);
		
		int array[] = {4,6,7,2,4,8,6};
		removeDuplicate(array);
	}

}
