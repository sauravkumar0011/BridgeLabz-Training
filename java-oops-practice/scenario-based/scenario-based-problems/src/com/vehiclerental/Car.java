package com.vehiclerental;

public class Car extends Vehicle implements Rentable{

	 public Car(int id, String brand, double rate) {
	        super(id, brand, rate);
	    }

	    @Override
	    public double calculateRent(int days) {
	        double surcharge = 500;
	        return (baseRate * days) + surcharge;
	    }
}
