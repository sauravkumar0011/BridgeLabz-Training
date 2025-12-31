/*
Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/

import java.util.*;

public class DigitalWatch{
	
	public static void watchSimulation(){
	for(int i = 0; i<24; i++){
		
		if(i == 13){
			  System.out.println("Hours: " + i + ":" + "00" + " Minutes");
			  System.out.println("\n\t---------");
	          System.out.println("\tPower Cut");
			  System.out.println("\t---------");
			  break;
		}
		
		for(int j=0; j<60; j++)
		{
			System.out.println("Hours: " + i + ":" + j + " Minutes");
		}
		
	}
	}
	
	public static void main(String[] args)
	{
		watchSimulation();
	}
}