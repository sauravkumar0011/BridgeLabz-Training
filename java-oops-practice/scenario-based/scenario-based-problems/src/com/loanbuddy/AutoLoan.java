package com.loanbuddy;

public class AutoLoan extends LoanApplication{

	 public AutoLoan(Applicant applicant, int term) {
	        super(applicant, term, 9.0);
	    }

	    public boolean approveLoan() {
	        boolean status = applicant.getCreditScore() >= 650 && applicant.getIncome() >= 25000;
	        setApproved(status);
	        return status;
	    }

	    public double calculateEMI() {
	        return baseEMI() * 1.02;
	    }
}
