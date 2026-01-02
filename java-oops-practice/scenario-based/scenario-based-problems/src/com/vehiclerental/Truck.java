package com.vehiclerental;

public class Truck extends Vehicle implements Rentable{

	  public Truck(int id, String name, double rate) {
	        super(id, name, rate);
	    }

	    @Override
	    public double calculateRent(int days) {
	        double heavyLoadCharge = 1000;
	        return (baseRate * days) + heavyLoadCharge;
	    }
}
