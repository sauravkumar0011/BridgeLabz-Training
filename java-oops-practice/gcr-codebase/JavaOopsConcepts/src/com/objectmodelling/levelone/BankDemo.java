package com.objectmodelling.levelone;

public class BankDemo {

	public static void main(String[] args) {
		
		    Bank canara = new Bank("Canara Bank");

	        Customer rohan = new Customer("saurav");
	        Customer amit = new Customer("himanshu");

	        canara.openAccount(rohan, 5000);
	        canara.openAccount(amit, 3000);

	        rohan.viewBalance();
	        amit.viewBalance();

	}

}
