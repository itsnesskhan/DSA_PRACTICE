package com.java.opps;

import java.util.ArrayList;

public class ForEachTesting {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(67);
		list.add(34);
		list.add(89);
		
		for (Integer integer : list) {
			list.add(89);  //foreach is read only
		}
		
	}

}
