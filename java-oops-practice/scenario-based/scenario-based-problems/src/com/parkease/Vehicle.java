package com.parkease;

abstract class Vehicle implements IPayable {

	protected int baseRate;

    public abstract double calculateCharges(int hours);
}
