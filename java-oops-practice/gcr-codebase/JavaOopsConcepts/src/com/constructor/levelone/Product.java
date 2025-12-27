package com.constructor.levelone;

public class Product {

	public String productName;
	public int price;
	static int totalProducts =0;
	public Product(String prodName, int price) {
		this.productName = prodName;
		this.price = price;
		totalProducts+=1;
	}
	
	public void displayProductDetails() {
		System.out.println("Product Name: "+this.productName);
		System.out.println("Product price: "+this.price);
	}
	
	public static void displayTotalProducts() {
		System.out.println("Total number of products created: "+ totalProducts);
	}
	
	public static void main(String[] args) {
		Product p1 = new Product("SportsCar", 10000);
		Product p2 = new Product("Bottle", 500);
		p1.displayProductDetails();
		p2.displayProductDetails();
		Product.displayTotalProducts();
	}
}
