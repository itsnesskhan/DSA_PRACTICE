package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(34);
		list.add(45);
		list.add(23);
		list.add(98);
		list.add(34);
		list.add(98);
		System.out.println(list);
		
		Set<Integer> listSet = new HashSet<>(list);
//		for(int e:list) {
//			listSet.add(e);
//		}
		System.out.println(listSet);

	}

}
