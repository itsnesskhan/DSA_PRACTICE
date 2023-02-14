import java.util.Collections;
import java.util.LinkedList;

public class CeasarCipherCode {
	
//	public static String  getCode(String code) {
//		char[] charArray = code.toCharArray();
//		System.out.println(charArray[1]);
//		char alfa;
//		for ( alfa= 'a'; alfa <='z' ; ++alfa) {
//			if (charArray[i]=='a') {
//				
//			}
//		}
//		return "";
//	}

//	public static void main(String[] args) {
//		int z = 'z';
//		System.out.println(z);
//		 int v= z+5;
//		 System.out.println("v"+(char)v);
//		int lenght = 'z'-'a'+1;
//		System.out.println(lenght);
//	}
//	
	
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(5);
		linkedList.add(53);
		linkedList.add(56);
		linkedList.add(53);
		System.out.println(linkedList);
		Collections.reverse(linkedList);
		System.out.println(linkedList);
	}
}
