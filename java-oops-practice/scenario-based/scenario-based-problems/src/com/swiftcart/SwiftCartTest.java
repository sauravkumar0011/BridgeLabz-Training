package com.swiftcart;

public class SwiftCartTest {

	public static void main(String[] args) {
		
		Product p1 = new PerishableProduct("Milk", 550, 5);
		Product p2 = new NonPerishableProduct("Rice", 60, 4);
		
		Cart c1 = new Cart();
		c1.addProduct(p1);
		c1.addProduct(p2);
		c1.applyDiscount();
		c1.generateBill();
	}

}
