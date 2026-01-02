package com.hospitalmanagementsystem;

public class OutPatient extends Patient{

	public OutPatient(int id, String name, String disease) {
        super(id, name, disease);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Patient Type: OutPatient");
    }
}
