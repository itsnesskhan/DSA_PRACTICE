package com.DSA;

import java.util.ArrayList;
import java.util.List;

public class StringSubSequence {
	
	public static List<String> subsequence(String str,String current,ArrayList<String> list) {
		if (str.length()==0) {
			list.add(current);
			return list;
			
		}
		
		subsequence(str.substring(1), current+str.charAt(0),list);
		subsequence(str.substring(1), current,list);
		return list;
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String str = "abc";
		List<String> subsequence = subsequence(str, "",list);
		System.out.println(subsequence);
	}

}
