package com.java.oppsMultiple;

public interface ICI extends Bank {

	@Override
	default void depositeMoney() {
		System.out.println("deposite using ici");
		
	}


}
