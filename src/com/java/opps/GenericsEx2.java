package com.java.opps;

public class GenericsEx2 <T extends Student> {

	private  T objT;

	public GenericsEx2(T objT) {
		super();
		this.objT = objT;
	}
	
	public <T> void printObj() {
		System.out.println("obj print"+objT);
		System.out.println(objT.getName());
	}
	
	
}
