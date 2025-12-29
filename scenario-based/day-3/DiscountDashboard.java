/*
Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/

import java.util.*;

public class DiscountDashboard{

    public static void calculateDiscount(int numberOfItems, Scanner sc){
	
	    double totalBill=0;
	    for(int i=0; i<numberOfItems; i++)
		{
			System.out.print("Enter Price of item " + (i+1) + ":");
			double number = sc.nextDouble();
			totalBill+=number;
		}
		if(totalBill >= 1000 && totalBill <= 2000){
			System.out.println("\n\t------------------------------------------------");
			System.out.println("\tYour Total price of all items is:\t" + totalBill);
			System.out.println("\tDiscount for you is 10% :        \t" + totalBill*0.1);
			System.out.println("\tAmount to pay after discount is: \t" + (totalBill-totalBill*0.1));
			System.out.println("\t--------------------------------------------------");
		}
		else if(totalBill > 2000 && totalBill <= 3000){
			System.out.println("\n\t------------------------------------------------");
		    System.out.println("\tYour Total price of all items is: \t" + totalBill);
			System.out.println("\tDiscount for you is  20% :         \t" + totalBill*0.2);
			System.out.println("\tAmount to pay after discount is:  \t" + (totalBill-totalBill*0.1));
			System.out.println("\t--------------------------------------------------");
		}
		else if(totalBill > 3000){
			System.out.println("\t--------------------------------------------------");
			System.out.println("\tYour Total price of all items is: \t" + totalBill);
			System.out.println("\tDiscount for you is 30%  :         \t" + totalBill*0.3);
			System.out.println("\tAmount to pay after discount is:  \t" + (totalBill-totalBill*0.1));
			System.out.println("\t--------------------------------------------------");
		}
		else{
			System.out.println("\t--------------------------------------------------");
			System.out.println("\tYour Total price of all items is: \t" + totalBill);
			System.out.println("\tSorry No any discount for you 0% :\t" + totalBill*0.0);
			System.out.println("\tAmount to pay after discount is:  \t" + (totalBill-totalBill*0.1));
			System.out.println("\t--------------------------------------------------");
		}
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of items you purchased : ");
        int number = sc.nextInt();
	
		if(number > 0)
		 calculateDiscount(number, sc);
	    else
		 System.out.print("Enter positive number: \n");

        
    }
}