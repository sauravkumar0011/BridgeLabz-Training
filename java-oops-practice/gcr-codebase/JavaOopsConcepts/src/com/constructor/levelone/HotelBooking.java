package com.constructor.levelone;

public class HotelBooking {

	public String guestName;
	public String type;
	public int nights;
	public int bill;
	
	public HotelBooking(){
		this.guestName = "Nageshwar";
		this.type = "Luxury";
		this.nights = 1;
		bill = this.nights*1000;
	}
	public HotelBooking(String guestName,String type, int nights){
		this.guestName = guestName;
		this.type = type;
		this.nights = nights;
		bill = this.nights*1000;
	}
	public HotelBooking(HotelBooking guest){
		this.guestName = guest.guestName;
		this.type = guest.type;
		this.nights = guest.nights;
		bill = this.nights*1000;
	}	
	
	public static void main(String[] args) {
		
		HotelBooking guest1 = new HotelBooking();
		HotelBooking guest2 = new HotelBooking("Himesh","Delux",2);
		HotelBooking guest3 = new HotelBooking(guest2);
		
		System.out.println("Guest 1 stayprice: "+guest1.bill);
		System.out.println("Guest 2 stayprice: "+guest2.bill);
		System.out.println("Guest 3 stayprice: "+guest3.bill);

	}

}
