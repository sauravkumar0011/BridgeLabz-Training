package com.loanbuddy;

public class LoanBuddyApp {

	public static void main(String[] args) {
		
		Applicant a1 = new Applicant("Saurav", 720, 50000, 500000);

        LoanApplication loan1 = new HomeLoan(a1, 240);

        if (loan1.approveLoan()) {
            System.out.println("Loan Approved");
            System.out.println("Monthly EMI: " + loan1.calculateEMI());
        } else {
            System.out.println("Loan Rejected");
        }

	}

}
