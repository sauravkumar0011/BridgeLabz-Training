package com.cabbygo;

public class Driver {

	private String name;
	private int licenseNumber;
	private double rating;
	
	public Driver(String name, int licenseNumber, double rating){
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.rating = rating;
	}
	
	public void showDriverInfo() {
        System.out.println("Driver Name   : " + name);
        System.out.println("Driver Rating : " + rating + "/5");
    }
}
