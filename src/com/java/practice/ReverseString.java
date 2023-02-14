package com.java.practice;

import java.util.Scanner;import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class ReverseString {
	public static void main(String []args) {
		String rev= "";
		System.out.println("Enter a String");
		Scanner scanner = new Scanner(System.in);
//		String str = scanner.nextLine();
//		StringBuffer stringBuffer = new StringBuffer(str);
//		System.out.println(stringBuffer);
//		System.out.println(stringBuffer.reverse());
////		char[] letter= scanner.nextLine().toCharArray();
////		for(int i = letter.length-1; i>=0;i--) {
////			rev = rev+letter[i];
////			System.out.println(rev);
////		}
////		System.out.println(rev);
////		
////		
		
//		char[] charArray = scanner.nextLine().toCharArray();
//		for (int i = charArray.length-1; i >=0; i--) {
//			rev =rev+charArray[i];
//		}
//		System.out.println(rev);
//			
//		}
		
		char[] charArray = scanner.nextLine().toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			rev = charArray[i]+rev;
		}
		System.out.println(rev);
		
	}
}
