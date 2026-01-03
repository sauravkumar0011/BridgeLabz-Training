package com.cabbygo;

public class Mini extends Vehicle implements IRideService{

	private double baseFare = 100;
	private double rate = 10;
	
	public Mini(int vehicleNumber, int capacity, String  type)
	{
		super(vehicleNumber, capacity, type);
	}
	
	public double getbaseFare()
	{
		return baseFare;
	}
	
	public double getRate()
	{
		return rate;
	}
	
	@Override
	public void calculateFare(Double distance){
		System.out.println(" Your Total Fare is: " + (getbaseFare() + distance * getRate()));
	};
	
	@Override
	public void bookRide(String location)
	{
		System.out.println("Your ride has been booked for " + location);
	}
	
	@Override
	public void endRide() {
		System.out.println("Your Ride has Ended!");
	};

	
}
