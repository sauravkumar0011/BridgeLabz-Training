package com.mybank;

public class CurrentAccount extends Account implements ITransaction{

    private String name;
    protected double interestRate = 6;
    
	public CurrentAccount(int accountNumber, double balance, String name) {
	super(accountNumber, balance);
	this.name = name;
	}
	
	@Override
	public void deposit(double money)
	{
		if(money>0)
		setBalance(getBalance() + money);
		System.out.println("Your money has deposited successfully!");
		System.out.println("Available Balance: " + getBalance());
	}
	
	@Override
	public void withdraw(double money)
	{
		if(money > 0 && money <= getBalance()) {
			setBalance(getBalance() - money);
			System.out.println("Your money has withdrawn successfully!");
			System.out.println("Available Balance: " + getBalance());
			}
			else
				 System.out.println("Insufficient balance or invalid amount");
	}
	
	@Override
	public void calculateInterest() {
		double interest = getBalance() * interestRate/100;
		System.out.println("Your total interst is: " + interest);
	}
	@Override
	public void checkBalance()
	{
		System.out.println("Account Type: Current Account");
		System.out.println("Your Balance is : " + getBalance());
	}
}
