package com.java.concepts;

class A{
	
	public static void name() {
		System.out.println("a's name method");
	}
}

class B extends A{
	
//	@Override //cannot use overide not static method
	public static void name() {
		System.out.println("b's name method");
	}
}

public class StaticOverride {
	public static void main(String[] args) {
		A a = new B();
//		B b = new A(); wont work
//		B.name();
		a.name();  //compile time polymorphysm
	}
}
