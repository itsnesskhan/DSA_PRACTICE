package com.java.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidMarksExcepiton extends Exception{
	public InvalidMarksExcepiton(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}

public class StudentP {
	private static int[] marks = new int[5];
	
	public static float FindPercentage(int[] marks) {
		int total =0;
		float percentage;
		for(int ma:marks) {
			total+=ma;
		}
		percentage = total/5;
		return percentage;
	}

	public static void main(String[] args) throws InvalidMarksExcepiton {
		System.out.println("Hello, Welcome to our Site");
		System.out.println("Please Enter the marks of ur subjects");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println("1 Hindi");
		System.out.println("2 English");
		System.out.println("3 Physics");
		System.out.println("4 Chemistry");
		System.out.println("5 Mathematics");
		Scanner sn = new Scanner(System.in);
		try {
			for(int i =0;i<marks.length;i++) {
				marks[i] = sn.nextInt();
				if(marks[i]>100) {
					throw new InvalidMarksExcepiton("Marks can't be greater than 100");
				}
			}
			System.out.println("Toal percentage of you is "+FindPercentage(marks)+"%");
			
		} catch (InputMismatchException e) {
			System.out.println("please enter a valid number ");
		}
		catch (InvalidMarksExcepiton e) {
			System.out.println(e);
			// TODO: handle exception
		}
		finally {
			System.out.println("Thank you");
		}
		
		
	}

}
