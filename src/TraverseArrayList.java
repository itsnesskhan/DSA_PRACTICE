import java.util.ArrayList;
import java.util.Iterator;

public class TraverseArrayList {
	public static void main(String []args) {
		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(5);
		aList.add(38);
		aList.add(89);
		aList.add(23);
		aList.add(90);
		
		System.out.println(aList);
		
		System.out.println("Traverse using for loop");
		for (int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}
		
		System.out.println("Traverse using whiel loop");
		int count =0;
		while(aList.size() >count){
			System.out.println(aList.get(count));
			count++;
		}
		
		System.out.println("Traverse using for each loop");
		for(int element:aList) {
			System.out.println(element);
		}
		System.out.println("Traversal using iterator");
		Iterator<Integer> it = aList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}	
	
}
