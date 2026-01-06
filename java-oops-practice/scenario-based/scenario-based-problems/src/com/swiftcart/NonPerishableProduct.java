package com.swiftcart;

public class NonPerishableProduct extends Product{

	double coupon = 0.1;
	int quantity;
	public NonPerishableProduct(String name, double price, int quantity)
	{
		super(name, price, "NonPerishable");
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
