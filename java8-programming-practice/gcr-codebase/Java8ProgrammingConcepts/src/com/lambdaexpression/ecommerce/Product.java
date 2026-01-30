package com.lambdaexpression.ecommerce;

public class Product {

	String name;
	double price;
	double rating;
	double discount;
	
	Product(String name, double price, double rating, double discount){
		this.discount = discount;
		this.price = price;
		this.name = name;
		this.rating = rating;
	}
	
	public String toString() {
		return name + "Price " + price + " rating " + rating + " discount " + discount + " " ;  
	}
}
