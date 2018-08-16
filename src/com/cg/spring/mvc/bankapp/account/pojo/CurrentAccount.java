package com.cg.spring.mvc.bankapp.account.pojo;

public abstract class CurrentAccount extends BankAccount{

	private double odLimit;
	private double accountBalance;
	private Customer customer = new Customer() {
	};

	public CurrentAccount(Customer customer, double accountBalance, double odLimit) {
		super(customer, accountBalance);
		this.odLimit = odLimit;
	}

	public double getOdLimit() {
		return odLimit;
	}

	public long getCurrentAccNo() {
		return getAccNo();
	}
	@Override
	public String toString() {
		return customer.toString() + odLimit;
	}
	
	public BankAccount withdraw(int amount) {
		if(amount > accountBalance)
			return null;
		else {
			accountBalance -= amount;
			return this;
		}
		
	}
}

