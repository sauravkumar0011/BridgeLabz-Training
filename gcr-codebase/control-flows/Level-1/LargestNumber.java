//Creating Class with name LargestNumber indicating the purpose is to check 
//which number is the largest.
import java.util.Scanner;

class LargestNumber {
          public static void main(String[] args){
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
              //Taking three numbers as input
              System.out.print("Enter a number1: ");
              int number1 = input.nextInt(); 
              System.out.print("Enter a number2: ");
              int number2 = input.nextInt(); 
              System.out.print("Enter a number3: ");
              int number3 = input.nextInt(); 

             //Display the which number is largest.
             System.out.println("Is the first number the largest : " + (number1>number2 && number1>number3)); 
             System.out.println("Is the second number the largest : " + (number2>number1 && number2>number3));
             System.out.println("Is the third number the largest : " + (number3>number2 && number3>number1));   
    
             input.close();
        }
}