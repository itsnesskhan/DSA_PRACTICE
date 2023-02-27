package com.bank;

import com.bank.entities.Bank;

public class WithdrawThread implements Runnable {

	private Bank account;

	public Bank getAccount() {
		return account;
	}

	public void setAccount(Bank account) {
		this.account = account;
	}

	public WithdrawThread(Bank account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			account.withdrawBalance(500.00);
			System.out.println(account.getAccountHondlerNameString()+" "+account.getBalance());
			
		}

	}

}
