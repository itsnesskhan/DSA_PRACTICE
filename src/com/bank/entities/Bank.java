package com.bank.entities;

public class Bank {

	public static String bankName;
	public static String branchName;
	public static String ifsc;

	private long accountNumber;
	private String accountHondlerNameString;
	private double balance;
	private Address address;

	public Bank() {
		super();
	}

	public Bank(long accountNumber, String accountHondlerNameString, double balance, Address address) {
		super();
		this.accountNumber = accountNumber;
		this.accountHondlerNameString = accountHondlerNameString;
		this.balance = balance;
		this.address = address;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHondlerNameString() {
		return accountHondlerNameString;
	}

	public void setAccountHondlerNameString(String accountHondlerNameString) {
		this.accountHondlerNameString = accountHondlerNameString;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static String getBankname() {
		return bankName;
	}

	public static String getBranchname() {
		return branchName;
	}

	public static String getIfsc() {
		return ifsc;
	}

	public double withdrawBalance(Double amount) throws IllegalArgumentException {
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount must be +positive");
		}
		if (amount > this.balance) {
			throw new IllegalArgumentException("Insufficient Balance");
		}

		this.balance = this.balance - amount;
		this.alert(amount, "Credit from", accountHondlerNameString);
		return amount;
	}

	public double DepositeAmount(Double amount) throws IllegalAccessException {
		if (amount <= 0) {
			throw new IllegalAccessException("Amount must be +positve");
		}

		this.balance = this.balance + amount;

		this.alert(amount, "Debit into", accountHondlerNameString);

		return amount;
	}

	public Bank getAccountByAccountNumber(long accountNumber, Bank[] allAccounts) {
		Bank tranforAccount = null;
		for (Bank bank : allAccounts) {
			if (accountNumber == bank.getAccountNumber()) {
				tranforAccount = bank;
			}
		}
		return tranforAccount;

	}

	public void alert(double amount, String action, String name) {
		System.out.println("Amount $" + amount + " " + action + " your account" + " " + name);

	}

	public static void setBankDetails(String bName, String bBranch, String ifcode) {
		bankName = bName;
		branchName = bBranch;
		ifsc = ifcode;
	}

	public void displayDetails() {
		System.out.println("Bank Name\t:" + bankName);
		System.out.println("Branch Name\t:" + branchName);
		System.out.println("IFSC Code\t:" + ifsc);
		System.out.println("Account Number\t:" + this.accountNumber);
		System.out.println("Account Holder Name  :" + this.accountHondlerNameString);
		System.out.println("Balance\t:" + this.balance);
		System.out.println("Address\t:" + address.getStreet() + " " + address.getCity());

	}

	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", accountHondlerNameString=" + accountHondlerNameString
				+ ", balance=" + balance + ", address=" + address + "]";
	}

}
