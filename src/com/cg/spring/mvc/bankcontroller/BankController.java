package com.cg.spring.mvc.bankcontroller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.spring.mvc.bankapp.account.pojo.BankAccount;
import com.cg.spring.mvc.bankapp.account.pojo.CurrentAccount;
import com.cg.spring.mvc.bankapp.account.pojo.Customer;
import com.cg.spring.mvc.bankapp.account.pojo.SavingsAccount;
import com.cg.spring.mvc.bankapp.account.service.BankAccountService;

@Controller
public class BankController {

	private BankAccountService service = new BankAccountService();
	private Customer customer;
	private BankAccount bankAccount;
	private CurrentAccount current;
	private SavingsAccount saving;
	private Collection<BankAccount> viewAll = new ArrayList<>();
	private Collection<BankAccount> fundList = new ArrayList<>();
	
	
	@RequestMapping("/add") 
	public String addAccount() {
		
		return "add";
	}
	
	@RequestMapping("/display")
	public String show(@RequestParam("holdername") String name, @RequestParam("email") String email, @RequestParam("dob") String dob, 
			@RequestParam("phone") String phone, @RequestParam("acctype") String accType, 
			@RequestParam("sal") String savAccType, @RequestParam("saccbal") String salAccBal,
			@RequestParam("nonsalbal") String nonSalBal, @RequestParam("overdraft") String overdraft,
			@RequestParam("caccbal") String cAccBal, Model model) {
		
		customer = new Customer(name, email, dob, phone) {
			
		};
		//System.out.println(accType);
		switch(accType) {
		
		case "current":
			
			current = new CurrentAccount(customer, Integer.parseInt(cAccBal), Integer.parseInt(overdraft)) {};
			service.addAccount(current);
			model.addAttribute("account", current);
			
			break;	
		
		case "savings":
				
				switch(savAccType) {
					
					case "salaried":
						
						saving = new SavingsAccount(customer,Integer.parseInt(salAccBal), true) {};
						service.addAccount(saving);
						model.addAttribute("account", saving);
						
						break;
						
					case "notsalaried":
						
						saving = new SavingsAccount(customer, Integer.parseInt(nonSalBal), false) {
						};
						service.addAccount(saving);
						model.addAttribute("account", saving);
						break;
				}
				break;
				
			
		}
	
		return "display";
	}
	
	@RequestMapping("/view")
	public String view(Model model) {
		
		viewAll = service.viewAllAccount();
		model.addAttribute("account", viewAll);
		
		return "view";
	}
	
	@RequestMapping("/deposit")
	public String deposit() {
		
		return "deposit";
	}
	
	@RequestMapping("/successDepo")
	public String confirmDeposit(@RequestParam("Daccno") String accNo, @RequestParam("Dmoney") String money, Model model) {
		
		bankAccount = service.deposit(Integer.parseInt(accNo), Integer.parseInt(money));
		model.addAttribute("Daccount", bankAccount);
		
		return "successDepo";
	}
	
	@RequestMapping("/withdraw")
	public String withdraw() {
		
		return "withdraw";
	}
	
	@RequestMapping("/successWith")
	public String confirmWith(@RequestParam("Waccno") String accNo, @RequestParam("Wmoney") String money, Model model) {
		
		bankAccount = service.withdraw(Integer.parseInt(accNo), Integer.parseInt(money));
		model.addAttribute("Waccount", bankAccount);
		
		return "successWith";
	}
	
	@RequestMapping("/fund")
	public String fundT() {
		return "fund";
	}
	
	@RequestMapping("/successFund")
	public String fundTransfer(@RequestParam("sourceAcc") String src , @RequestParam("destinationAcc") String destination, @RequestParam("amount") String amount, Model model) {
		
		fundList = service.fundTransfer(Integer.parseInt(src), Integer.parseInt(destination), Integer.parseInt(amount));
		model.addAttribute("fund", fundList);
		return "successFund";
	}
	
}
