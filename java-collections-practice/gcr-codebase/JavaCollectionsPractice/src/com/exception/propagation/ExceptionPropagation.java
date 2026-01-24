package com.exception.propagation;

public class ExceptionPropagation {

	public static void main(String[] args) {

		try {
			double interest = doubleCalculateInterest(10000, -5 , 2);
			System.out.print("Interest is " + interest);
		}catch(IllegalArgumentException e) {
			System.out.print(e.getMessage());
		}
	}
	
	public static double doubleCalculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
		
		if(amount<0 || rate<0)
			throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
		
		return (amount * rate * years)/100;
	}

}
