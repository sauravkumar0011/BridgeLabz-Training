package com.cabbygo;
import java.util.Scanner;

public class CabbygoTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Cabbgo!");
		
		System.out.println("1. Mini");
		System.out.println("2. Sedan");
		System.out.println("3. Suv");
		System.out.print("Select Vehicle type for booking : ");
		int i = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter your location : ");
		String Currlocation = sc.nextLine();
		
		System.out.print("Enter distance : ");
		Double distance = sc.nextDouble();
		
		Driver d1 = new Driver("Vikash Kumar",4567, 4.2 );
		
		switch(i)
		{
			case 1:
			Mini m1 = new Mini(2345, 3 , "Mini");
			System.out.println("-------------------------------");
			     m1.bookRide(Currlocation);
			     m1.showVehicleInfo();
			     d1.showDriverInfo();
			     System.out.println("-------------------------------");
			     m1.calculateFare(distance);
			     m1.endRide();
				break;
			case 2:
			Sedan s1 = new Sedan(2345, 4 , "Sedan");
			System.out.println("-------------------------------");
			     s1.bookRide(Currlocation);
		         s1.showVehicleInfo();
		         d1.showDriverInfo();
		         System.out.println("-------------------------------");
		         s1.calculateFare(distance);
		         s1.endRide();
				break;
			case 3:
			 Suv s2 = new Suv(2345, 6 , "Suv");
			 System.out.println("-------------------------------");
			 s2.bookRide(Currlocation);
		     s2.showVehicleInfo();
		     d1.showDriverInfo();
		     System.out.println("-------------------------------");
		     s2.calculateFare(distance);
		     s2.endRide();
				break;
			default:
				System.out.println("Invalid vehicle type");
		}

	}

}
