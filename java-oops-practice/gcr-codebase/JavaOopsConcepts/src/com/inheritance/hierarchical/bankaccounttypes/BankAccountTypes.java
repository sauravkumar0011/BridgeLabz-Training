package com.inheritance.hierarchical.bankaccounttypes;

public class BankAccountTypes {

    public static void main(String[] args) {

        //Hierarchical inheritance demonstration
        BankAccount acc1 = new SavingsAccount("SB155001", 500000, 3.6);
        BankAccount acc2 = new CheckingAccount("CA255001", 3050000, 1000);
        BankAccount acc3 = new FixedDepositAccount("FD355001", 22500000, 6);

        acc1.displayDetails();
        acc1.displayAccountType();
        System.out.println("----------------------");

        acc2.displayDetails();
        acc2.displayAccountType();
        System.out.println("----------------------");

        acc3.displayDetails();
        acc3.displayAccountType();
    }
}
