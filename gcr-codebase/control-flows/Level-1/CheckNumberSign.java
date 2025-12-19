//Creating Class with name CheckNumberSign indicating the purpose is to check 
//number is positive, negative, or zero .
import java.util.Scanner;

class CheckPersonVotingEligibility {
          public static void main(String[] args){
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
              //Taking the number as input
              System.out.print("Enter a number: ");
              int number = input.nextInt(); 
             
             //Checking the number is  positive, negative, or zero.
             if(number > 0) 
             {
               System.out.println("positive");
             }
             else if(number < 0)
             {
              System.out.println("negative");
             }
             else 
             {
              System.out.println("zero");
             }
    
             input.close();
        }
}