package com.cabbygo;

public class Vehicle {

	private int vehicleNumber;
	private int capacity;
	private String type;
	
	public Vehicle(int vehicleNumber, int capacity, String  type){
		this.capacity = capacity;
		this.vehicleNumber = vehicleNumber;
		this.type = type;
	}
		
	public void calculateFare(Double distance){};
	
	
	public void showVehicleInfo()
	{
		 System.out.println("Vehicle Number : " + vehicleNumber);
	     System.out.println("Vehicle Type   : " + type);
	     System.out.println("Capacity       : " + capacity);
	}

}
