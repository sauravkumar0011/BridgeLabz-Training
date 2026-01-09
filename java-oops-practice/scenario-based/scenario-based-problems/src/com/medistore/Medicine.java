package com.medistore;

import java.time.LocalDate;

public class Medicine implements ISellable{

	private String name;
	private double price;
	private LocalDate expiryDate;
	private int quantity;
	
	Medicine(String name, double price, LocalDate expiryDate)
	{
		this.name = name;
		this.price = price;
		this.expiryDate = expiryDate;
		this.quantity = 200;
	}
	
	  public String getName() {
	        return name;
	    }

	    protected int getQuantity() {
	        return quantity;
	    }

	    protected LocalDate getExpiryDate() {
	        return expiryDate;
	    }

	    private double calculateTotal(int qty) {
	        return price * qty; 
	    }

	    protected double applyDiscount(double amount) {
	        return amount * 0.95;
	    }

	    @Override
	    public void sell(int qty) {
	        if (qty > quantity || checkExpiry()) {
	            System.out.println(name + " cannot be sold.");
	            return;
	        }

	        quantity -= qty; 
	        double total = calculateTotal(qty);
	        total = applyDiscount(total);

	        System.out.println("Sold " + qty + " " + name + " | Bill: ₹" + total);
	    }

		@Override
		public boolean checkExpiry() {
			
			return false;
		}
}
