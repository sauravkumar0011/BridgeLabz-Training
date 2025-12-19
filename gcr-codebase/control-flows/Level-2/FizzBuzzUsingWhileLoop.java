//Creating Class with name FizzBuzzUsingWhileLoop indicating the purpose is to check for a positive integer 
import java.util.Scanner;

class FizzBuzzUsingWhileLoop {
          public static void main(String[] args){
             //Create a Scanner Object
             Scanner input = new Scanner(System.in);
          
             //Taking a number as input
             System.out.print("Enter the number ");
             int number = input.nextInt(); 

             //Check for a positive integer and print result using while loop 
             while(number>0)
             {
                if(number % 5 ==0 && number % 3 ==0)
                    System.out.println("FizzBuzz");
                else if(number % 3 == 0)
                    System.out.println("Fizz");
                else if(number % 5 == 0)
                    System.out.println("Buzz");
               
                  number--;
              }
        }
}