package com.cinemahouse;

public class Test {

	public static void main(String[] args) {

		CinemaHouse cinema = new CinemaHouse(10);
		
		cinema.addShowtime(2100);
		cinema.addShowtime(1400);
		cinema.addShowtime(1000);
		cinema.addShowtime(2000);
		cinema.addShowtime(1250);

		System.out.println("Manager is sorting the schedule...");
		cinema.sortShowtimes();
		cinema.displaySchedule();
		
	} 

}
