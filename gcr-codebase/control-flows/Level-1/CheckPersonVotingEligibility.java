//Creating Class with name CheckPersonVotingEligibility indicating the purpose is to check 
//person can vote or cannot.
import java.util.Scanner;

class CheckPersonVotingEligibility {
          public static void main(String[] args){
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
              //Taking person age as input
              System.out.print("Enter a number: ");
              int age = input.nextInt(); 
             
             //Checking the person can vote or cannot based on their age.
             if(age >= 18) 
             {
               System.out.println("The person's age is " + age  + "and can vote.");
             }
             else
             {
              System.out.println("The person's age is " + age + " and cannot vote.");
             }
    
             input.close();
        }
}