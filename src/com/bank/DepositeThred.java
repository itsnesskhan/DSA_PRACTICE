package com.bank;

import com.bank.entities.Bank;

public class DepositeThred implements Runnable {
	
	private Bank account;

	public DepositeThred(Bank account) {
		super();
		this.account = account;
	}

	public Bank getAccount() {
		return account;
	}

	public void setAccount(Bank account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				account.DepositeAmount(5.00);
				System.out.println(account.getAccountHondlerNameString()+" "+account.getBalance());
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}
