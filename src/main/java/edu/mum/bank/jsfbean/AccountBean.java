package edu.mum.bank.jsfbean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import edu.mum.bank.domain.Account;
import edu.mum.bank.domain.Customer;
import edu.mum.bank.service.AccountService;

@Named
@SessionScoped
public class AccountBean implements Serializable {
	private static final long serialVersionUID = -8070450323645303196L;

	
	private Account account;
	//private List<Account> accounts;
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	private AccountService accountService = new AccountService();
	
	public AccountBean() {
		this.account= new Account();
		this.customer= new Customer();
	}

	public String create(Account account){
		account = accountService.createAccount(account.getAccountnumber(), account.getCustomer().getName());
		if (account == null) return "create";
		else return "findAll";
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
