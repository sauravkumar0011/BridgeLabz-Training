package com.fleetmanager;

public class Vehicle {

	private String id;
	private double mileage;
	
	public Vehicle(String id, double mileage)
	{
		this.id = id;
		this.mileage = mileage;
	}
	
	public double getMileage() {
		return mileage;
	}
	
	public String getId() {
		return id;
	}
}
