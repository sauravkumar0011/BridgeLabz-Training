//Creating Class with name FizzBuzz indicating the purpose is to check for a positive integer 
import java.util.Scanner;

class FizzBuzz {
          public static void main(String[] args){
             //Create a Scanner Object
             Scanner input = new Scanner(System.in);
          
             //Taking a number as input
             System.out.print("Enter the number ");
             int number = input.nextInt(); 

             //Check for a positive integer and print result using for loop 
             for(int i = 1; i <= number; i++)
             {
                if(i % 5 ==0 && i % 3 ==0)
                    System.out.println("FizzBuzz");
                else if(i % 3 == 0)
                    System.out.println("Fizz");
                else if(i % 5 == 0)
                    System.out.println("Buzz");
              }
        }
}