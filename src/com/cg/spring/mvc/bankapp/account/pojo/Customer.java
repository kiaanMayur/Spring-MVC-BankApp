package com.cg.spring.mvc.bankapp.account.pojo;

import java.time.LocalDate;

public abstract class Customer {
	
	private String customerName;
	private String email;
	private String dob;
	private String contact;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String accHolderName, String email, String dob, String contact) {
		
		this.customerName = accHolderName;
		this.email = email;
		this.dob = dob;
		this.contact = contact;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getEmail() {
		return email;
	}
	public String getDob() {
		return dob;
	}
	public String getContact() {
		return contact;
	}

	@Override
	public String toString() {
		return "customerName = " + customerName + "\nemail = " + email + "\ndob = " + dob + "\ncontact = " + contact;
	}
	
	

}
