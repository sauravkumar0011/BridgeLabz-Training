/*  
 Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.
*/

import java.util.Scanner;

public class ParkingLotGateSystem{

    public static int smartParkingSystem(String option, int occupancy){
		
		switch(option){
			case "Park":
			if(occupancy>0){
			System.out.println("You can park the car\n");
			occupancy--;
			}
			break;
			case "Show Occupancy":
			System.out.println("Available Occupancy is: " + occupancy + "\n");
			break;
			case "Exit":
			if(occupancy == 10)
				System.out.println("NO vehicle is parked\n");
			else
				System.out.println("You are Exited");
			break;
			default:
			System.out.println("Enter Valid options\n");
		}
		
		return occupancy;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Park");
        System.out.println("2. Exit");
        System.out.println("3. Show Occupancy\n");

        int occupancy = 10;
        while(true)
        {
		 System.out.print("Enter one of the option: ");
         String option = sc.nextLine();
		 
		 occupancy = smartParkingSystem(option, occupancy);
		 
         if((option.equals("Exit") || occupancy == 0) )
		 {
			if(occupancy == 0)
			System.out.println("Occupancy is not Available");
			break;
		 }
        }
    }
}