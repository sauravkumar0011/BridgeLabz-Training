package com.mybank;

public interface ITransaction {

	void deposit(double money);
	void withdraw(double money);
	void checkBalance();
}
