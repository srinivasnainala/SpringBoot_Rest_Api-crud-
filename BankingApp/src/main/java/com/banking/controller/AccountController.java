package com.banking.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.banking.model.Account;
import com.banking.service.AccountService;

@RestController
@RequestMapping("/bank")
public class AccountController {
 @Autowired
 AccountService accountservice;
	@PostMapping("/addaccount")
	public String addAccount(@RequestBody Account account)
	{
		return accountservice.addaccount(account);
	}
	@GetMapping("/{id}")
	public Account getAccount(@PathVariable int id)
	{
		return accountservice.getAccount(id);
	}
	@GetMapping("/allAccounts")
	public List<Account> getAccounts()
	{
		return accountservice.getAccounts();
	}
	@PutMapping("/{id}/deposit")
	public String deposit(@PathVariable int id,@RequestParam double amount)
	{
		return accountservice.deposit(id,amount);
	}
	@PutMapping("/{accountnumber}/deposit1")
	public String depositByAccnum(@PathVariable String accountnumber,@RequestParam double amount )
	{
		return accountservice.depositByAccnum(accountnumber,amount);
	}
	@PutMapping("/{accountnumber}/withdraw")
	public String withdraw(@PathVariable String accountnumber,@RequestParam double amount)
	{
		return accountservice.withdraw(accountnumber,amount);
	}
	@DeleteMapping("/{accountnumber}/delete")
	public String deleteAccount(@PathVariable String accountnumber)
	{
		return accountservice.deleteAccount(accountnumber);
	}
}
