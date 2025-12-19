//Creating Class with name SmallestNumber indicating the purpose is to check 
//if the first is the smallest of the 3 numbers.
import java.util.Scanner;

class CheckNumber {
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

             //Display the smallest of the 3 numbers
             System.out.println("Is the first number the smallest : " + (number1<number2 && number1<number3));    
    
             input.close();
        }
}