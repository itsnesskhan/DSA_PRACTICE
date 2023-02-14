package com.Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		// sorted map is not generic
		TreeMap<Student, Double> map = new TreeMap<Student, Double>(new CustomComparator());
		map.put(new Student(1, "Nasser Khan", "Indore"), 15000.00);
		map.put(new Student(2, "Zoya Sheikh", "Mumbai"), 27000.00);
		map.put(new Student(3, "Hamda Khan", "Allahbad"), 23000.00);
		map.put(new Student(4, "Ayush Kushwah", "Khargone"), 34690.00);
		map.put(new Student(5, "Roman Reings", "Filadefiya"), 23000.00);
		map.put(new Student(5, "jumana Agnihotri", "Filadefiya"), 23000.00);
		map.put(null, null);

		System.out.println(map);
		System.out.println(map.lastEntry());
		System.out.println(map.firstEntry());
		System.out.println(map.keySet());
		Set<Student> keySet = map.keySet();
		Iterator<Student> iterator = keySet.iterator();
		Student next = iterator.next();
		//assign refrence of custom object if u want to use key
	}

}

class CustomComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().split("\\s")[1].compareTo(o2.getName().split("\\s")[1]);
	}

}
