/*
Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.
*/

import java.util.*;

public class LuckyDraw{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int visitor = 5;
		do{
			visitor--;
			if(visitor == 0)
				break;
			System.out.print("Do you wanna participate in lucky draw! (y/n): ");
			char choice = sc.next().charAt(0);
			sc.nextLine();
			
			if(choice=='y' || choice=='Y'){
				System.out.print("Enter your lucky number: ");
				int num = sc.nextInt();
				
				if(num % 5==0 && num%3==0){
					System.out.println("Yeh! You won a gift");
				}
				else{
					System.out.println("Sorry! you have not won anything");
				}
			}
			else if(choice=='n' || choice=='N'){
				System.out.println("Please Visit Again!");
				break;
			}
			else
				continue;
		}while(true);
	}
}