package com.cg.spring.mvc.bankapp.account.pojo;

public abstract class SavingsAccount extends BankAccount {
	
	private boolean salary;
	
	private Customer customer = new Customer() {
	};

	public SavingsAccount(Customer customer, double accountBalance, boolean salary) {
		super(customer, accountBalance);
		
		this.salary = salary;
	}
	
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	public boolean isSalary() {
		return salary;
	}
	
	public long getSavingsAccNo() {
		return getAccNo();
	}
	
	@Override
	public String toString() {
		
		return customer.toString() + "salary = " + salary;
	}
	
	
	
}
