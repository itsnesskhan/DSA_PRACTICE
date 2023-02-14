package com.Collections;

interface mytest
{ void my();
}

class mytests{
	void my(){
		System.out.println("inside method");
	}
}

public class PrintNumbeer{
	
	public static void printNumber() {
		for (int i = 10; i>=1; i-=3) {
			System.out.println(i);
			
		}
	}
	
	
	public static void main(String[] args) {
		printNumber();
		Float float1 = new Float("10.0");
//		byte byt = new Byte(float1);
		System.out.println(float1);
	}
//10 7 4 1
}
