package com.encapsulation.ecommerceplatform;

public class Clothing extends Product implements Taxable{

    public Clothing(int productId, String name, double price)
	{
		super(productId, name, price);
	}
	
	@Override
	public double calculateDiscount() {
		return price * 0.10; 
	}
	
	@Override
	public double calculateTax()
	{
		return price * 0.18;
	}
	
	@Override
	public String getTaxDetails() {
		return "18 % GST on Clothing";
	}
}
