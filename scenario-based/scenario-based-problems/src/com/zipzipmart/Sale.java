package com.zipzipmart;

import java.time.LocalDate;
public class Sale {

	 LocalDate date;
	    double amount;

	    Sale(LocalDate date, double amount) {
	        this.date = date;
	        this.amount = amount;
	    }

	    void show() {
	        System.out.println(date + " - Amount: " + amount);
	    }
}
