package com.Collections;

import java.security.PublicKey;

public class CalulateArea {
	
	public static float getArea(Ractangle ractangle ) {
		
		return ractangle.getLength() * ractangle.getHight();
	}

	public static void main(String[] args) {
//		Ractangle ractangle = new Ractangle(4, 5);
//		Ractangle ractangle2 = new Cube(4, 5);
////		cube.setHight(5);
////		cube.setLength(4);
//		System.out.println(getArea(ractangle2));
		int count =0;
		 int num = 9;
		 while (num>0) {
			count+= num & 1;
			num>>=1;
		}	
		 
		 
		 System.out.println(count);
	}
}
