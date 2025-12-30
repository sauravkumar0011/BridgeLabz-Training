/*
Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/

import java.util.*;

public class MovieTicket{
	
	public static int bookTicket(Scanner sc,int seats){
	   
	    String snacks = "";
	   
		System.out.println("\nEnter Movie Type");
		    System.out.println("1. Action  ($200)");
            System.out.println("2. Comedy  ($250)");
            System.out.println("3. Horror ($250)");
            System.out.println("4. Thriller  ($300)\n");
		String movieType = sc.nextLine();
		System.out.println("Enter Seat Type: Gold ($100 extra), Silver ($0) ");
		String seatType = sc.nextLine();
		System.out.println("Do you want snacks: Enter yes or No");
		String choice = sc.nextLine();
		if(choice.equals("Yes")){
		System.out.println("Enter Snacks you want: Coffee, Bun, Cakes, Pies");
		    System.out.println("1. Coffee  ($15)");
            System.out.println("2. Bun  ($10)");
            System.out.println("3. Cakes ($20)");
            System.out.println("4. Pies  ($5)\n");
	    snacks = sc.nextLine();
		}
		int moviePrice = 0;
		int seatPrice = 0;
		
		switch (movieType) {

        case "Action":
        moviePrice = 200;
        break;

        case "Comedy":
        moviePrice = 250;
        break;

        case "Horror":
        moviePrice = 250;
        break;

        case "Thriller":
        moviePrice = 300;
        break;

        default:
        movieType = "Invalid";
        moviePrice = 0;
        seatPrice = 0;
        }

        if (seatType.equals("Gold")) {
              seatPrice = 100;
        } 
		else if(seatType.equals("Silver")){
             seatPrice = 0;
        }
		else{
			seatType = "Invalid"; 
		}
		
		int snackPrice = 0;
		
		if(choice.equals("Yes"))
		{
			switch(snacks)
			{
				case "Coffee": 
				snackPrice = 15;
				break;
				case "Bun": 
				snackPrice = 10;
				break;
				case "Cakes": 
				snackPrice = 20;
				break;
				case "Pies": 
				snackPrice = 5;
				break;
				default: 
				snacks = "Not available";
			}
		}
		else if (choice.equals("No")){
			snackPrice = 0;
		}
		else{
			choice = "Invalid";
		}
		
		if(movieType.equals("Invalid"))
		{
			System.out.println("Please select correct movie type");
		}
		if(seatType.equals("Invalid"))
		{
			System.out.println("Please select correct seat type");
		}
		else{
			int totalBill = moviePrice + seatPrice + snackPrice;
			System.out.println("\n--------- Booking Summary ---------");
            System.out.println("Movie     : " + movieType + "\t$" + moviePrice );
            System.out.println("Seat Type : " + seatType + "\t$" + seatPrice);
            System.out.println("Snack     : " + snacks + "      \t$" + snackPrice);
            System.out.println("-----------------------------------");
            System.out.println("Total Bill:          \t$" + totalBill);
            System.out.println("-----------------------------------");
			seats--;
		}
		
		return seats;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		int seats = 2;
		while(true){
	    seats = bookTicket(sc,seats);
		if(seats == 0){
		System.out.println("Sorry, No more seats are avaialble");
			break;
		}
		}
	}
}