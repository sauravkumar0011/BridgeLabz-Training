package com.eventmanager;

public class Ticket {

	 String eventName;
	    int price;

	    Ticket(String eventName, int price) {
	        this.eventName = eventName;
	        this.price = price;
	    }

	    void show() {
	        System.out.println(eventName + " - Price: " + price);
	    }
}
