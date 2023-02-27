package com.bank;

import javax.sound.midi.Soundbank;

import com.bank.entities.Address;
import com.bank.entities.Bank;

public class StartingPoint {
	public static void main(String[] args) throws IllegalAccessException, InterruptedException {
		double amount = 0;
		Address address = new Address("Naya Mohalla", "Dharmpuri");
		Bank bank = new Bank(9713216901L, "Nasser Khan", 15, address);

		Address address1 = new Address("juna Mohalla", "Dharmpuri");
		Bank bank1 = new Bank(7987680669L, "Hamda Khan", 15, address);

//		Address address2 = new Address("juna Mohalla", "Dharmpuri");
//		Bank bank2 = new Bank(9713216901L, "Aisha Sheikh", 5000, address);
//
//		Address address3 = new Address("juna Mohalla", "Dharmpuri");
//		Bank bank3 = new Bank(9713216901L, "Zoya Khan", 0.0, address);

//		DepositeThred depositeThred = new DepositeThred(bank);
//		DepositeThred depositeThred1 = new DepositeThred(bank2);
//		WithdrawThread withdrawThread = new WithdrawThread(bank1);
//		WithdrawThread withdrawThread2 = new WithdrawThread(bank3);
		
		TransferThread t1 = new TransferThread(bank, bank1);
		TransferThread t2 = new TransferThread(bank1, bank);

		Thread thread = new Thread(t1);
		Thread thread2 = new Thread(t2);
//		Thread thread3 = new Thread(depositeThred1);
//		Thread thread4 = new Thread(withdrawThread2);

		thread.start();
		thread2.start();
//		thread3.start();
//		thread4.start();
		
//		
//	
		Thread.sleep(1000);
		System.out.println(bank);
		System.out.println(bank1);

	}

}
