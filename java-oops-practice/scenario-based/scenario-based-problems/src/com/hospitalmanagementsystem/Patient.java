package com.hospitalmanagementsystem;

public class Patient {

	private int patientId;
	private String name;
	private String disease;
	private String medicalHistory;
	
	public Patient(int patientId, String name, String disease){
		this.patientId = patientId;
		this.name = name;
		this.disease = disease;
	}
	
	public Patient(int patientId, String name, String disease, String medicalHistory){   //for emergency
		this.patientId = patientId;
		this.name = name;
		this.disease = disease;
	    this.medicalHistory = medicalHistory;
	}
	
	public int getPatientId() {
		return patientId;
	}
	
	public String getPatientName() {
		return name;
	}
	
	public void summary() {
		System.out.println("Id : " + patientId);
		System.out.println("Name : " + name);
		System.out.println("Disease : " + disease);
		System.out.println("MedicalHistroy : " + medicalHistory);
	}
	
	public void displayInfo() {
		summary();
	}
	
}
