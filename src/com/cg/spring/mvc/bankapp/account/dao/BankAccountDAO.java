package com.cg.spring.mvc.bankapp.account.dao;

import java.util.Collection;

import com.cg.spring.mvc.bankapp.account.pojo.BankAccount;

public interface BankAccountDAO {

	void addAccount(BankAccount bankAccount);

	Collection<BankAccount> viewAllAccount();

	Collection<BankAccount> searchEmployee(int id);
	
	BankAccount withdraw(int acccno, int amount);
	BankAccount deposit(int acccno, int amount);

	Collection<BankAccount> fundTransfer(int sourceAcc, int destinationAcc, int amount);

}