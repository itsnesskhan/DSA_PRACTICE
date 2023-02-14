package com.java.opps;

public class GenericsExample<T extends Number> {

	private T first;
	private T second;
	
	
	public GenericsExample(T first, T second) {
		super();
		this.first = first;
		this.second = second;
	}
	
	public <T> Double getAddition() {
		 double sumT = this.first.doubleValue() + this.second.doubleValue();
		return sumT; 
	}
}
