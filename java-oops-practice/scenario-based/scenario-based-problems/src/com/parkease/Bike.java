package com.parkease;

public class Bike extends Vehicle{

	public Bike() {
        baseRate = 20;
    }

    public double calculateCharges(int hours) {
        int penalty = hours > 6 ? 50 : 0;
        return (baseRate * hours) + penalty;
    }
}
