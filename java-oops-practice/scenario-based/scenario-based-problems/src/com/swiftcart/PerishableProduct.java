package com.swiftcart;

public class PerishableProduct extends Product{

	double coupon = 0.1;
	int quantity;
	public PerishableProduct(String name, double price, int quantity)
	{
		super(name, price,"Perishable");
		this.quantity = quantity;
	}
	
	@Override
	public double getTotalPrice() {
		double total = getPrice() * quantity;
		return total;
	}
	
	@Override
	public double getDiscount() {
		double total = getPrice() * quantity;
		return  (total * coupon);
	}
}
