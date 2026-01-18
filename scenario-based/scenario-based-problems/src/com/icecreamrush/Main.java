package com.icecreamrush;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		    List<Flavor> flavors = new ArrayList<>();

	        flavors.add(new Flavor("Vanilla", 120));
	        flavors.add(new Flavor("Chocolate", 200));
	        flavors.add(new Flavor("Strawberry", 90));
	        flavors.add(new Flavor("Mango", 150));
	        flavors.add(new Flavor("Butterscotch", 110));
	        flavors.add(new Flavor("Pista", 80));
	        flavors.add(new Flavor("Coffee", 140));
	        flavors.add(new Flavor("Black Current", 70));

	        BubbleSortFlavors sorter = new BubbleSortFlavors();
	        sorter.sortByPopularity(flavors);

	        
	        for (Flavor f : flavors) {
	            System.out.println(f.getName() + " → Sold: " + f.getSales());
	        }
	}

}
