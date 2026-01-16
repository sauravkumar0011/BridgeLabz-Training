package com.cinemahouse;

import java.util.Arrays;

public class CinemaHouse {

	private int[] showtimes;
	private int count;
	
	public CinemaHouse(int maxShows) {
		this.showtimes = new int[maxShows];
		this.count = 0;
	}
	
	public void addShowtime(int time) {
		if(this.count < this.showtimes.length) {
			this.showtimes[this.count++] = time;
		}
	}
	
	public void sortShowtimes() {
		int n = count;
		
		for(int i =0; i< n-1; i++) {
			boolean swapped = false;
			
		for(int j=0; j< n- i - 1; j++) {
			if(showtimes[j] > showtimes[j+1]) {
				int temp = showtimes[j];
				showtimes[j] = showtimes[j+1];
				showtimes[j+1] = temp;
				swapped = true;
			}
		}
			if(!swapped) 
				break;
		}
	}
	
	public  void displaySchedule() {
		System.out.println("Sorted Movie Schedule: "  + Arrays.toString(Arrays.copyOf(showtimes, count)));
	}
}
