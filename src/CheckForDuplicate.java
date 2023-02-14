
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.sound.midi.Soundbank;

public class CheckForDuplicate {
	public static void findDuplicate(int[] first, int[] second) {
		boolean f = false;
		for (int i = 0; i < first.length; i++) {
			for (int k = 0; k < second.length; k++) {
				if (first[i] == second[k]) {

					System.out.println("found at" + first[i]);
				}
			}
		}

	}

	public static void notInBoth(int first[], int second[]) {
		String[] strings = { "Naser", "hamda", "hamda", "mohit" };
		HashSet<String> set = new HashSet<>();
		System.out.println(set);

	}

	public static void main(String[] args) {
		Integer arr1[] = { 1, 45, 6, 44, 56, 90, 77, 56, 90 ,47};
		System.out.println(arr1.getClass().getTypeName());
		Integer arr2[] = { 79, 67, 34, 89, 13, 46, 44, 80, 47 };
		
		HashSet<Integer> hashSet1 = new HashSet<>(Arrays.asList(arr1));
		System.out.println(hashSet1);
		HashSet<Integer> hashSet2 = new HashSet<>(Arrays.asList(arr2));
		System.out.println(hashSet2);
		hashSet1.addAll(hashSet2);
		System.out.println(hashSet1);
		Integer array[] = new Integer[hashSet1.size()];
		array = hashSet1.toArray(array);
		System.out.println(Arrays.toString(array));
		int i=0;
		for (Integer element : hashSet2) {
			i++;
			if(hashSet1.contains(element)) {
				System.out.println(element+" found at "+i);
			}
		}
		
//		Iterator<Integer> element = hashSet1.iterator();
//		while (element.hasNext()) {
//			System.out.println(element.next());
//		}

	}
}
