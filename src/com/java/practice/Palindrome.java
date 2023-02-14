package com.java.practice;


import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args){
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(IsPalindrome(num));
	}
	
	
	 static boolean IsPalindrome(int num) {
		int sum=0,r,temp =num;
		while(num>0) {
		r = num%10;
		sum = (sum*10)+r;
		num = num/10;
		}
		if(sum== temp)
			return true;
		return false;
	}
}
