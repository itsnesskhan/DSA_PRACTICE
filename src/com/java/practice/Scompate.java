package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.w3c.dom.ls.LSInput;

public class Scompate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Students> list = new ArrayList<>();
		list.add(new Students(1,"Nasser","indore"));
		list.add(new Students(5, "Hamda","Allahabad"));
		list.add( new Students(3, "Zoya","Mumbai"));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
