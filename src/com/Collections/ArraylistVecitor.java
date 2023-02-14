package com.Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ArraylistVecitor {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>(5,5);
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		
//		System.out.println(vector.capacity());
		for (int i = 0; i < vector.capacity(); i++) {
			vector.add(i+1);
		}
		System.out.println(vector.capacity());
		vector.add(7);
		vector.add(9);
		vector.add(8);
		System.out.println(vector.capacity());
		System.out.println(vector);
		vector.insertElementAt(17, 2);
		vector.add(58);
		System.out.println(vector.get(2));
		System.out.println(vector.set(2,45));
		System.out.println(vector);
		System.out.println(vector);
	
		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.li
//		
//		ListIterator<Integer> itr = vector.listIterator();
//		while (itr.hasNext()) {
//			Integer next = itr.next();
//			if (next%2==0) {
////				itr.set(786);	
//			}
//			else if(next.equals(45)) {
////				itr.remove();
////				itr.add(456);
//			}
//			
//		}
//		System.out.println(vector);
		
//		ListIterator<Integer> listIterator = vector.listIterator(vector.size());
//		while (listIterator.hasPrevious()) {
//			System.out.println(listIterator.previous());
//		}
//		
//		
//		Enumeration<Integer> elements = vector.elements();
//		while (elements.hasMoreElements()) {
//			Integer element = elements.nextElement();
//			System.out.println(element);
//			
//		}
//		
//		for (Integer integer : vector) {
//			System.out.println(integer);
//		}
		
		Iterator<Integer> iterator2 = vector.iterator();
		while (iterator2.hasNext()) {
				Integer next = iterator2.next();
				if (next>2) {
					iterator2.remove();
					
				}
			
		}
		
		
		ArrayList<String> arrayList = new ArrayList<String>();
		for (int i = 0; i < 3; i++) {
			arrayList.add("Nasser"+i);
		}
		System.out.println(arrayList);
		
		System.out.println();
		Iterator<String> iterator = arrayList.iterator();
		
	}
}
