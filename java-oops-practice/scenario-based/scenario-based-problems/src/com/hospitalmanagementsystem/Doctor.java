package com.hospitalmanagementsystem;

public class Doctor{

	private int doctorId;
	private String doctorName;
	
	Doctor(int doctorId, String doctorName){
		this.doctorId = doctorId;
		this.doctorName = doctorName;
	}

	public void displayInfo() {
		System.out.println("Doctor id : " + doctorId);
		System.out.println("Doctor Name : " + doctorName);
	}
}
