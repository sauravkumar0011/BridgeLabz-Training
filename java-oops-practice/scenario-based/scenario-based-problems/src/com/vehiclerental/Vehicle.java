package com.vehiclerental;

public class Vehicle {

	protected int id;
	protected String name;
	protected double baseRate;
	
	public Vehicle(int id, String name, double baseRate)
	{
		this.id = id;
		this.name = name;
		this.baseRate = baseRate;
	}
	
	public void displayInfo() {
        System.out.println("Vehicle ID: " + id);
        System.out.println("Brand: " + name);
        System.out.println("Base Rate: " + baseRate);
    }
}
