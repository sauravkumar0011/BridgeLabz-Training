package com.robowarehouse;

import java.util.ArrayList;
import java.util.List;

public class RoboWarehouse {

	private List<Double> packageShelf;
	
	public RoboWarehouse() {
		this.packageShelf = new ArrayList<>();	
	}
	
	public void loadPackage(double weight) {
		int i = 0;
		
		while(i < packageShelf.size() && packageShelf.get(i) < weight) {
			i++;
		}
		
		packageShelf.add(i,weight);
		System.out.println("Loaded package " + weight + "kg at position " + i);	
	}
	
	public void displayShelf() {
		System.out.println("current shelf Order (Weight): " + packageShelf.toString());
	}
}
