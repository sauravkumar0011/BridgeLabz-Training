package com.medistore;

import java.time.LocalDate;

public class MediStoreTest {

	public static void main(String[] args) {
	   
	        Medicine t1 = new Tablet("Paracetamol", 2.5,
	                LocalDate.of(2026, 5, 10));

	        Medicine s1 = new Syrup("Cough Syrup", 120,
	                LocalDate.of(2026, 2, 1));

	        Medicine i1 = new Injection("Insulin", 300,
	                LocalDate.of(2026, 1, 15));

	        t1.sell(5);
	        s1.sell(2);
	        i1.sell(1);

	}

}
