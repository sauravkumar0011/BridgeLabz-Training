/*
The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.
*/

import java.util.*;

public class NumberGuessingGame{

    public static int numberGuessHint(int number, int randomNumber,int wrongTries){
	
		if(randomNumber == number){
			System.out.println("\nYou Guessing is Corrects");
			wrongTries = 5;
		}
		else if(number > randomNumber){
		    System.out.println("Your Number is Too high\n");
			wrongTries++;
			int remain = 5 - wrongTries;
			System.out.println("Remaining Attempt: " + remain);
		}
		else{
			System.out.println("Your Number is Too low\n");
			wrongTries++;
			int remain = 5 - wrongTries;
			System.out.println("Remaining Attempt: " + remain);
		}
		
		return wrongTries;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
		int randomNumber = random.nextInt(100)+1;
		int wrongTries = 0;
		
        while(true)
        {
		 System.out.print("Guess a number between 1 and 100: ");
         int number = sc.nextInt();
		 
		 //System.out.print(randomNumber);
		 if(number > 0)
		 wrongTries = numberGuessHint(number,randomNumber,wrongTries);
	     
	     else
		 System.out.print("Enter positive number between 1 and 100: \n");
		 
			if(wrongTries == 5){
			break;
			}
        }
    }
}