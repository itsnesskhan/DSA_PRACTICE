package com.java.oppsMultiple;

public class Customer implements SBI, ICI {

	@Override
	public void withdrawMoney() {
		SBI.super.withdrawMoney();
		
	}

	@Override
	public void depositeMoney() {
		// TODO Auto-generated method stub
		SBI.super.depositeMoney();
	}

}
