package com.cg.spring.mvc.bankapp.account.pojo;

public abstract class BankAccount {
	private double accountBalance;
	private Customer customer;
	private long accNo;
	
	
	private static int accountId;
	
	static {
		accountId = 10000;
	}

	{
		this.accNo = ++accountId;
	}
	
	public BankAccount(Customer customer, double accountBalance) {
		this.customer = customer;
		this.accountBalance = accountBalance;
		
	}
	public BankAccount( ) {
		
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	

	public Customer getCustomer() {
		return customer;
	}
	
	public long getAccNo() {
		return accNo;
	}
	
	public static int getAccountId() {
		return accountId;
	}
	
public BankAccount withdraw(int amount) {
		
		if(amount > accountBalance)
			return null;
		else {
			accountBalance -= amount;
			return this;
		}
	}

	public BankAccount deposit(int amount) {
		accountBalance += amount;
		return this;
	
	}
	
	public void setAccountBalance(double d) {
		this.accountBalance = d;
		
	}
}
