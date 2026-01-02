package com.hospitalmanagementsystem;

public class Bill implements Bill_Interface{

	private double baseAmount;
	
	Bill(double baseAmount)
	{
		this.baseAmount = baseAmount;
	}
	
	@Override
	public void calculatePayment() {
		 double tax = baseAmount * 0.18;
		 double discount = baseAmount * 0.10;
		System.out.println("Base Amount : " + baseAmount);
		System.out.println("Tax 18% : " + (tax));
		System.out.println("Discount : " + discount);
		System.out.println("-----------------------");
		System.out.println("Total Bill : " + (baseAmount + tax - discount));
	}
}
