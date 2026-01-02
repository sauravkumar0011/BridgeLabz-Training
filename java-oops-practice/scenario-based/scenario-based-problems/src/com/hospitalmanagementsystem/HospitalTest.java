package com.hospitalmanagementsystem;

public class HospitalTest {

	public static void main(String[] args) {
		
		Doctor dr = new Doctor(12345,"Dr. Vikash Singh");
		Patient p1 = new InPatient(4567,"Vikash Kumar", "fever", 5);
		Patient p2 = new OutPatient(7567,"Romeo Kumar", "Cancer");
		Bill b = new Bill(50000);
		
		dr.displayInfo();
        System.out.println("-----------------------");
        p1.displayInfo();
        System.out.println("-----------------------");
        p2.displayInfo();
        System.out.println("-----------------------");
        b.calculatePayment();

	}

}
