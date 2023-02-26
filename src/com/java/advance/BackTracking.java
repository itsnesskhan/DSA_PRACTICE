package com.java.advance;

public class BackTracking {
	
	public static void printParmutations(String string,String perm, int idx) {
		if (string.length() == 0) {
			System.out.println(perm);
		}
		
		for (int i = 0; i < string.length(); i++) {
			char charAt = string.charAt(i);
			 String newStr = string.substring(0,i)+string.substring(i+1);
			 printParmutations(newStr, perm+charAt, idx+1);
//			 System.out.println(charAt);
//			 System.out.println(newStr);
		}
	}

	public static void main(String[] args) {
		String string ="ABC";
		printParmutations(string, "", 0);
//		System.out.println(string.substring(0,0));
//		System.out.println(string.substring(0+1));
//		System.out.println(string.charAt(0));
//		System.out.println(string);
	}
}
