package com.cg.spring.mvc.bankapp.account.service;

import java.util.Collection;

import com.cg.spring.mvc.bankapp.account.dao.BankAccountDAOimpl;
import com.cg.spring.mvc.bankapp.account.pojo.BankAccount;

public class BankAccountService {
	
	private BankAccountDAOimpl dao = new BankAccountDAOimpl();
	
	public void addAccount(BankAccount bankAccount) {
		dao.addAccount(bankAccount);
	}

	public Collection<BankAccount> viewAllAccount() {
		return dao.viewAllAccount();
	}

	public Collection<BankAccount> searchEmployee(int id) {
		return dao.searchEmployee(id);
	}
	
	public BankAccount withdraw(int accno, int amount) {
		return dao.withdraw(accno, amount);
	}
	
	public BankAccount deposit(int accno, int amount) {
		return dao.deposit(accno, amount);
	}

	public Collection<BankAccount> fundTransfer(int sourceAcc, int destinationAcc, int amount){
		return dao.fundTransfer(sourceAcc, destinationAcc, amount);
	}

}
