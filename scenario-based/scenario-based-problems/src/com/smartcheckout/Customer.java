package com.smartcheckout;

import java.util.ArrayList;
public class Customer {

	int id;
	String name;
	ArrayList<String> items = new ArrayList<>();
	
	public Customer(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void addItem(String item)
	{
		items.add(item);
	}
	
}
