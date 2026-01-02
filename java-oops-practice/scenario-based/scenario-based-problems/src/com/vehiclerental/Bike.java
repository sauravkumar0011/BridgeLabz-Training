package com.vehiclerental;

public class Bike extends Vehicle implements Rentable{

	public Bike(int id,String name, double baseRate)
	{
		super(id, name, baseRate);
	}
	
	@Override
	public double calculateRent(int days)
	{
		return baseRate * days;
	}
}
