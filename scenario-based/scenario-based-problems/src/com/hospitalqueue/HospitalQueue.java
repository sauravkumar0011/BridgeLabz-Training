package com.hospitalqueue;

public class HospitalQueue {

	static void sortByCriticality(Patient[] patients) {
        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (patients[j].criticality < patients[j + 1].criticality) {
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
	}
	public static void main(String[] args) {
		
		   Patient[] patients = {
		            new Patient("Amit", 4),
		            new Patient("Riya", 9),
		            new Patient("Karan", 6),
		            new Patient("Neha", 8),
		            new Patient("Vikram", 3)
		        };

		        sortByCriticality(patients);

		        for (Patient p : patients) {
		            p.show();
		        }
	}

}
