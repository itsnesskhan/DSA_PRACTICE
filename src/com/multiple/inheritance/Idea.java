package com.multiple.inheritance;

public interface Idea{

	public default void makeCall() {
		System.out.println("calling using idea");
		
	}
	
	public default void takeCall() {
		System.out.println("receiving call using idea");
		
	}
	
	public void makeVideoCall();
}
