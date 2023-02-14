package com.Collections;

import java.util.Arrays;
import java.util.Iterator;

public class CapitalFirst {
	public static void capitalFirst(String s[]) {
		String substring = "";
		String remaning = "";
		String capString = "";
		String spaceString = "";
		
		for (int i = 0; i < s.length; i++) {
		String[] split = s[i].split("\\s");
			for (int j = 0; j < split.length; j++) {
					 substring = split[j].substring(0, 1);
					 remaning = split[j].substring(1);
				 spaceString =(j<1)?" ":"";
					capString+= substring.toUpperCase()+remaning+spaceString ;
			}
			s[i] = capString;
			capString = "";
		}
		System.out.println(Arrays.toString(s));
	}
	
	public static void main(String[] args) {
		String[] string = {"nasser khan", "hamda kHAN", "zoya khan", "aISHA SHEIKH","neil nitin mukesh"," "};
		capitalFirst(string);
		
//		Arrays.asList(string).stream().map(element->element)
		
		for (int i = 0; i < string.length; i++) {
			String[] split = string[i].split("\\s");
			for (int j = 0; j < split.length; j++) {
//				String substring = split[i].substring(0,1);
//				String substring2 = split[i].substring(1);
//				String substring2 = split[1].substring(0,1);
				
				
			}
			
		}
		
		Testing testing = new Testing();
		System.out.println(testing);
		int w = (int)888.8;
		byte x = (byte)100L;
		long y = (byte)100;
		byte z = (byte)100L;
		System.out.println(w+" get type");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
