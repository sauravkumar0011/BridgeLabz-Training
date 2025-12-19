//Creating Class with name CheckNaturalNumber indicating the purpose is to check 
//number is  natural or not.
import java.util.Scanner;

class CheckNaturalNumber {
          public static void main(String[] args){
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
              //Taking a number as input
              System.out.print("Enter a number: ");
              int number = input.nextInt(); 
             
             //Checking the number is natural  and  print sum of it.
             if(number >= 0) 
             {
               System.out.println("The sum of " + number + " natural numbers is " + (number*(number+1)/2));
             }
             else
             {
              System.out.println("The number " + number + "is not a natural number ");
             }
    
             input.close();
           }
}