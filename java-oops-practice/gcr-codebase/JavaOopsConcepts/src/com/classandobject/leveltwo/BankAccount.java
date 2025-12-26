package com.classandobject.leveltwo;

public class BankAccount {

	private String accountHolder;
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountHolder,String accountNumber,double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	//Method to display bank name
	public static void displayBank() {
		System.out.println("\t\t\t\tState of Chennai\t\t\t\t");
		
	}
	
	//Method to display deposited money
	public void deposit(double amount) {
		if(amount > 0) {
			balance+=amount;
			System.out.println("Deposited: "+amount);
		}
		else {
			System.out.println("Amount to deposit must be positive");
		}
	}
	
	//Method to display withdrawal money
	public void withdraw(double amount) {
		if (amount <= balance && amount > 0) {
			balance -= amount;
			System.out.println("Withdraw amount is : "+amount);
		}
		else if (amount <= 0) {
			System.out.println("Withdrawal amount must be positive");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
   //Method to display balance
   public void displayBalance() {
       System.out.println("Current balance: " + balance);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankAccount account = new BankAccount("saurav", "123456789000", 102700.00);
	      
	       displayBank();
	      
	       account.displayBalance();
	       account.deposit(200.00);
	       account.displayBalance();
	       account.withdraw(100.00);
	       account.displayBalance();
	      
	       account.withdraw(900.00);
	}

}
