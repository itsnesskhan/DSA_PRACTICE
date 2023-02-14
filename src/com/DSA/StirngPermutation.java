package com.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class StirngPermutation {
	
	
	static void printPermutation(String string,String permuation) {
		if (string.length() ==0) {
			System.out.println(permuation);
		}
		for (int i = 0; i < string.length(); i++) {
			char charAt = string.charAt(i);
			String remaingString = string.substring(0,i)+string.substring(i+1);
			printPermutation(remaingString, permuation+charAt);
		}
	}
	
	static List<String> printPermutationWithDuplicates(String string,String permuation, Set<String> list) {
		if (string.length() ==0) {
			list.add(permuation);
			return new ArrayList<String>(list);
		}
		for (int i = 0; i < string.length(); i++) {
			char charAt = string.charAt(i);
			
			String remaingString = string.substring(0,i)+string.substring(i+1);
			printPermutationWithDuplicates(remaingString, permuation+charAt, list);
		}
		return new ArrayList<String>(list);
	}
	
	static String removeDups(String S) {
        String newstrString = "";
        for (int i = 0; i < S.length(); i++) {
			char charAt = S.charAt(i);
			if (newstrString.indexOf(charAt)==-1) {
				newstrString+=charAt;
			}
		}
		return newstrString;
    }
	
	public static void main(String[] args) {
		HashSet<String> list = new HashSet<String>();
		String string = "ABC";
		printPermutation(string, "");
		List<String> set= printPermutationWithDuplicates(string, "", list);
		System.out.println(set);
		String removeDups = removeDups(string+"CD");
		System.out.println(removeDups);
	}

}
