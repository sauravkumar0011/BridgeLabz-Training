package com.bookbazar;

public class BookBazaarApp {

	public static void main(String[] args) {
		
		Book b1 = new EBook("Java Basics", "Herbert", 500, 50);
        Order o1 = new Order(b1, 2);

        o1.placeOrder();

        if (o1.isCompleted()) {
            System.out.println("Order Placed");
            System.out.println("Total Cost: " + o1.getTotalCost());
        }

	}

}
