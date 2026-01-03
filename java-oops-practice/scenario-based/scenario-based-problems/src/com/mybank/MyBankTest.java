package com.mybank;
import java.util.Scanner;

public class MyBankTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------------");
		System.out.println("Dear Customer, Welcome to MyBank");
		System.out.println("----------------------------------");
		
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check Balance");
		System.out.println("4. Calculate Interest");
		System.out.print("Choose one option:");
		int i = sc.nextInt();
		
		double amount = 0;
		Account acc = new SavingsAccount(111001254,1000.00,"Saurav Kumar");
		ITransaction tx = (ITransaction) acc;

		
		switch(i) {
		case 1: 
			System.out.print("Enter the deposit amount: ");
			amount = sc.nextDouble();
			tx.deposit(amount);
			break;
		case 2:
			System.out.print("Enter the withdraw amount: ");
			amount = sc.nextDouble();
			tx.withdraw(amount);
		    break;
		case 3:
			tx.checkBalance();
			break;
		case 4:
			acc.calculateInterest();
			break;
		default:
			System.out.println("Invalid Input");	
		}
		
		sc.close();

	}

}
