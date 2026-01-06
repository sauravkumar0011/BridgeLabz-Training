package com.swiftcart;

import java.util.*;

public class Cart implements ICheckout{

	static double totalPrice;
	ArrayList<Product> products;
	
	public Cart()
	{
		products = new ArrayList<>();
		totalPrice = 0.0;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public double calculateTotalPrice()
	{
		for(Product p: products)
		{
		   totalPrice+= p.getTotalPrice();
		}
		return totalPrice;
	}
	
	double discount = 0.0;
	
	@Override
	public double applyDiscount()
	{
		for(Product p: products)
		{
		   discount+=p.getDiscount();
		}
		return discount;
	}
	
	@Override
	public void generateBill()
	{
        System.out.println("---- SwiftCart Bill ----");
        for (Product p : products) {
            System.out.println(p.getName() + " - ₹" + p.getTotalPrice());
        }
        System.out.println("Discount Amount : ₹" + discount);
        System.out.println("Total Payable: ₹" + (calculateTotalPrice() - discount));
	}
	
}
