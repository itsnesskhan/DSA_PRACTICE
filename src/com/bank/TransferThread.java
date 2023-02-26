package com.bank;

import com.bank.entities.Bank;

public class TransferThread implements Runnable {

	private Bank from;
	private Bank to;

	public Bank getAccount() {
		return from;
	}

	public void setAccount(Bank account) {
		this.from = account;
	}

	public TransferThread(Bank account, Bank transfer) {
		super();
		this.from = account;
		this.to = transfer;
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			try {
			TransferThread.TransforMoney(from,15.00, to );
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
	
	
	public static double TransforMoney(Bank from, double amount, Bank Transferaccount) throws IllegalAccessException {
		if (amount <= 0) {
			throw new IllegalAccessException("Amount must be +positive");
		}
		if (amount > from.getBalance()) {
			throw new IllegalArgumentException("Insufficient Balance");
		}
						from.withdrawBalance(amount);
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Transferaccount.DepositeAmount(amount);
					
		System.out.println("Amount " + amount + " transfored to" + Transferaccount.getAccountNumber());
		return amount;
	}

}
