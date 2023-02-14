package com.java.practice;

import java.security.PublicKey;
import java.util.Iterator;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 7;
		boolean isprime = true;
		if (num<2) {
			System.out.println(num+" is not a prime number");
			return;
		}
		for (int i = 2; i < num/2; i++) {
			if (num%i == 0) {
				isprime = false;
				break;
			}
		}
		if (isprime) {
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println(num+" is not a prime number");
		}
	}
}
