package com.parkease;

public class Car extends Vehicle{

	 public Car() {
	        baseRate = 50;
	    }

	    public double calculateCharges(int hours) {
	        int penalty = hours > 5 ? 100 : 0;
	        return (baseRate * hours) + penalty;
	    }
}
