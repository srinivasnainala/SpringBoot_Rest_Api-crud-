package com.banking.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.model.Account;
import com.banking.repository.AccountRepo;

import jakarta.transaction.Transactional;

@Service
public class AccountService {

	@Autowired
	AccountRepo accountrepo;

	public String addaccount(Account account) {
		return "Account added succuessfully\n"+accountrepo.save(account);
	}

	public Account getAccount(int id) {
		
		Account acc=accountrepo.findById(id).get();
		return acc;
	}

	public List<Account> getAccounts() {
		return accountrepo.findAll();
	}

	
	public String deposit(int id,double amount) {
	   Account acc=accountrepo.findById(id).get();
	   double total=acc.getBalance()+amount;
	   acc.setBalance(total);
	   accountrepo.save(acc);
		return amount+" credited to your A/C: "+acc.getAccountnumber()+"\nCurrent balance is :"+total;
	}

	public String depositByAccnum(String accountnumber,double amount) {
		String err="";
		try
		{
			if(accountrepo.findByaccountnumber(accountnumber) != null)
			{
				Account acc=accountrepo.findByaccountnumber(accountnumber);
				double total=acc.getBalance()+amount;
				acc.setBalance(total);
				accountrepo.save(acc);
				return amount+" credited to your A/C: "+accountnumber+"\nCurrent balance is :"+total;
			}
			else
			{
				throw new Exception("Account not found");
			}
		}
		catch(Exception e)
		{
			err=e.getMessage();
			return err;
		}
	}

	public String withdraw(String accountnumber, double amount) {
		Account acc=accountrepo.findByaccountnumber(accountnumber);
		String err="";
		try
		{
		if(acc.getBalance()>amount)
		{
		double withdraw=acc.getBalance()-amount;
		acc.setBalance(withdraw);
		accountrepo.save(acc);
		return amount+" debited from your A/C:"+ accountnumber+" \nRemaining balance is "+withdraw;
		}
		throw new Exception("Insufficient funds");
		}
		catch(Exception e)
		{
            err=e.getMessage();
            return err;
		}
		 
	}
	@Transactional
	public String deleteAccount(String accountnumber) {
		String err="";
		try
		{
			if(accountrepo.findByaccountnumber(accountnumber)!=null)
			{
				accountrepo.deleteByaccountnumber(accountnumber);
				return "Deleted Successfully";
			}
			else
			{
				throw new Exception("Account not found");
			}
		}
		catch(Exception e)
		{
			err=e.getMessage();
			return err;
		}
	}
}
