package com.banking.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="account")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
	@Column(name="accountnumber")
private String accountnumber;
	@Column(name="holdername")
private String holdername;
	@Column(name="balance")
private double balance;

public Account() {
}

public Account(int id, String accountnumber, String holdername, double balance) {
	super();
	this.id = id;
	this.accountnumber = accountnumber;
	this.holdername = holdername;
	this.balance = balance;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getAccountnumber() {
	return accountnumber;
}

public void setAccountnumber(String accountnumber) {
	this.accountnumber = accountnumber;
}

public String getHoldername() {
	return holdername;
}

public void setHoldername(String holdername) {
	this.holdername = holdername;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

@Override
public String toString() {
	return "AccountDetails: \nid=" + id + ",\naccountnumber=" + accountnumber + ",\nholdername=" + holdername + ",\nbalance="
			+ balance + "";
}

}
