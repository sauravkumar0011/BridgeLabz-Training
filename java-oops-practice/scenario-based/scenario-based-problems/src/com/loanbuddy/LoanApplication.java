package com.loanbuddy;

abstract class LoanApplication implements IApprovable{

	protected int term;
    protected double interestRate;
    protected Applicant applicant;
    private boolean approved;

    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
    }

    protected void setApproved(boolean status) {
        approved = status;
    }

    public boolean isApproved() {
        return approved;
    }

    protected double baseEMI() {
        double p = applicant.getLoanAmount();
        double r = interestRate / 12 / 100;
        int n = term;
        return (p * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
    }
	
}
