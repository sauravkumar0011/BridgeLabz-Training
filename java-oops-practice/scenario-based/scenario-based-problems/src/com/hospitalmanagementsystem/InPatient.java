package com.hospitalmanagementsystem;

public class InPatient extends Patient{

	private int daysAdmitted;
	
	public InPatient(int patientId, String name, String disease, int daysAdmitted) {
	        super(patientId,name,disease);
	        this.daysAdmitted = daysAdmitted;
	}
	
	@Override
	public void displayInfo() {
		super.summary();
		System.out.println("No. Days Admitted : " + daysAdmitted);
	}

}
