package com.java.oppsMultiple;

public interface SBI extends Bank {

	
		
	@Override
	default void withdrawMoney() {
		System.out.println("withdraw from sbi");
		
	}

	@Override
	default void depositeMoney() {
		System.out.println("deposite usijng sbi");
		
	}

}
