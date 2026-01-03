package com.mybank;

public class Account {

    protected int accountNumber;
	private double balance;
	
	public Account(int accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		if(balance>=0)
		this.balance = balance;
		else
		this.balance = 0;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		if(balance>=0)
		this.balance = balance;
	}
	
	public void calculateInterest(){}
	
	public void showCustomerInfo() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Available balance: " + balance);
	}
	
}
