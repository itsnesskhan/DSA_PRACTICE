package com.java.practice;

import java.util.Scanner;

public class NumCampare {
	public static void main(String []args) {
		System.out.println("Enter Both Numbers");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		CompareNum(a,b);
	}
	
	public static void CompareNum(int a, int b) {
		if(a==b) {
			System.out.println(a+" == "+b);
		}
		else if(a>b){
			System.out.println(a+" != "+b);
			System.out.println(a+" >= "+b);
		}
		else {
			System.out.println(a+" != "+b);
			System.out.println(a+" <= "+b);
		}
	}
}
