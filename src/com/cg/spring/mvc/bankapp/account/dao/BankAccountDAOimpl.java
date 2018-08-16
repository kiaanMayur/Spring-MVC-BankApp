package com.cg.spring.mvc.bankapp.account.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import com.cg.spring.mvc.bankapp.account.pojo.BankAccount;

public  class BankAccountDAOimpl implements BankAccountDAO {
	
	private static Set<BankAccount> bankAccountSet;
	private static Map<Integer, BankAccount> bankAccountMap;
	private BankAccount account = new BankAccount() {
	};
	
	private Collection<BankAccount> fundSet = new ArrayList<>();

	
	static {
		bankAccountSet = new HashSet<>();
		bankAccountMap = new HashMap<>();
	}
	
	/* (non-Javadoc)
	 * @see com.cg.bankapp.account.dao.BankAccountDAO#addAccount(com.cg.bankapp.account.pojo.BankAccount)
	 */
	@Override
	public void addAccount(BankAccount bankAccount) {
		bankAccountSet.add(bankAccount);
		bankAccountMap.put((int) bankAccount.getAccNo(),bankAccount);
		
	}
	
	/* (non-Javadoc)
	 * @see com.cg.bankapp.account.dao.BankAccountDAO#viewAllAccount()
	 */
	@Override
	public Collection<BankAccount> viewAllAccount() {
		return bankAccountMap.values();
	}
	
	/* (non-Javadoc)
	 * @see com.cg.bankapp.account.dao.BankAccountDAO#searchEmployee(int)
	 */
	@Override
	public Collection<BankAccount> searchEmployee(int id) {
		Predicate<BankAccount> checkById = (Integer) -> BankAccount.getAccountId() == id;
		if(bankAccountSet.stream().anyMatch(checkById))
			return bankAccountMap.values();
		else
			return null;
	}
	
	public BankAccount withdraw(int accno, int amount) {
		for(BankAccount account : bankAccountMap.values()) {
			Predicate<BankAccount> checkById = (Integer) -> bankAccountMap.containsKey(accno);
			if(bankAccountSet.stream().anyMatch(checkById))
				return account.withdraw(amount);
			else
				return null;
		}
		return null;
		
	}
	
	public BankAccount deposit(int accno, int amount) {		
		
		for(BankAccount account : bankAccountMap.values()) {
			Predicate<BankAccount> checkById = (Integer) -> bankAccountMap.containsKey(accno);
			if(bankAccountSet.stream().anyMatch(checkById))
				return account.deposit(amount);
			else
				return null;
		}
		return null;
		
	}
	
	public Collection<BankAccount> fundTransfer(int sourceAcc, int destinationAcc, int amount) {
		
		int i = 0;
			for(BankAccount account : bankAccountMap.values()) {
			Predicate<BankAccount> checkSource = (Integer) -> bankAccountMap.containsKey(sourceAcc);
			Predicate<BankAccount> checkDestination = (Integer) -> bankAccountMap.containsKey(destinationAcc);
			if(bankAccountSet.stream().anyMatch(checkSource)) {
				
				fundSet = bankAccountMap.values();
			}
			
			if(bankAccountSet.stream().anyMatch(checkDestination)) {
				
				fundSet = bankAccountMap.values();
			}
				
		}
		
//		source.setAccountBalance(source.getAccountBalance() - destination.getAccountBalance());
//		destination.setAccountBalance(source.getAccountBalance() - destination.getAccountBalance());
//		
//		fundSet.add(source);
//		fundSet.add(destination);
		for(BankAccount bank : fundSet) {
			bank.setAccountBalance(bank.getAccountBalance() - amount);
			break;
		}
		
		for(BankAccount bank : fundSet) {
			
			if(i == 1) {
				bank.setAccountBalance(bank.getAccountBalance() + amount);
				break;
			}
			i++;
		}
		return fundSet;
	}
}
