package com.classandobject.leveltwo;

public class TicketBookingSystem {

	private String movieName;
	private String seatNumber;
	private double price;
	private boolean isBooked;
	
	TicketBookingSystem(String movieName){
		this.movieName = movieName;
		this.seatNumber = "Null";
		this.price = 0.0 ;
		this.isBooked = false;
	}
	
	//Method to book a ticket
	public void bookTicket(String seatNumber, double price) {
		if(isBooked) {
			System.err.println("House full!!! sorry..... Ticket already booked");
		}
		else {
			this.seatNumber = seatNumber;
			this.price = price;
			this.isBooked= true;
			System.out.println("Ticket booked for movie: " + this.movieName);
            System.out.println("Seat Number: " + this.seatNumber);
            System.out.println("Price: $" + this.price);
		}
	}
	
	//Method to display the booked tickets
	public void displayTicket() {
		if(this.isBooked) {
			System.out.println("Ticket booked for movie: " + this.movieName);
           System.out.println("Seat Number: " + this.seatNumber);
           System.out.println("Price: $" + this.price);	
		}
		else {
			System.out.println("Ticket have not booked yet....");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketBookingSystem ticket1 = new TicketBookingSystem("Aavtar");
		
		//calling the method
		ticket1.displayTicket();
		ticket1.bookTicket("A10",120.0);
		ticket1.bookTicket("B10", 120.0);
		ticket1.bookTicket("A11", 120.0);
		ticket1.displayTicket();
	}

}
