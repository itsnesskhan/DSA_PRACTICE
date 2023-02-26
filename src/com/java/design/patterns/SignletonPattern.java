package com.java.design.patterns;

class TestingSignton{
	
	private static TestingSignton signton = null;
	
	private TestingSignton() {
		System.out.println("i am getting called only once");
	}
	
	public static TestingSignton getInstance() {
		if (signton == null) {
			signton = new TestingSignton();
		}
		return signton;
	}
}

public class SignletonPattern {
	public static void main(String[] args) {
		TestingSignton instance = TestingSignton.getInstance();
		System.out.println(instance);
		TestingSignton instance2 = TestingSignton.getInstance();
		System.out.println(instance2 == instance);
	}

}
