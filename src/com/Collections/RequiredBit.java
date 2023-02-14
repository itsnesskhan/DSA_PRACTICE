package com.Collections;

public class RequiredBit {
	public static void getBits(int num) {
		int count = 0;
//		String binaryString = Integer.toBinaryString(num);
//		System.out.println(binaryString);
		
		while(num!=0) {
			count++;
			num >>= 1;
		}
		System.out.println(count);
//		System.out.println("required bits are"+Integer.bitCount());
	}

	public static void main(String[] args) {
		int num = 5;
		getBits(num);
	}
}
