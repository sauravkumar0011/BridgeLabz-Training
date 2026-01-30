package com.lambdaexpression.ecommerce;

import java.util.*;

public class ShopTest {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Phone",20500,4.2,5));
		products.add(new Product("Laptop",10000,3.2,6));
		products.add(new Product("SmartWatch",30000,4.1,10));

		System.out.println("Sorted by price:");
		products.sort((p1,p2) -> Double.compare(p1.price, p2.price));
		products.forEach(System.out::println);
		System.out.println("-----------------------------------------");
		
		System.out.println("Sorted by rating:");
		products.sort((p1,p2) -> Double.compare(p1.rating, p2.rating));
		products.forEach(System.out::println);
		System.out.println("-----------------------------------------");
		
		System.out.println("Sorted by discount:");
		products.sort((p1,p2) -> Double.compare(p1.discount, p2.discount));
		products.forEach(System.out::println);
	}

}
