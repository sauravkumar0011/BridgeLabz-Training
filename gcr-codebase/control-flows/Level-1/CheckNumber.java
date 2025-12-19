//Creating Class with name CheckNumber indicating the purpose is to check number is divisible by 5 or not.
import java.util.Scanner;

class CheckNumber {
          public static void main(String[] args){
          //Create a Scanner Object
          Scanner input = new Scanner(System.in);
          
          //Taking a number as input
          System.out.print("\nEnter a number: ");
          int number = input.nextInt(); 

          //Display number is divisible by 5 or not
          System.out.println("Is the number " + number + "divisible by 5 : " + (number % 5 == 0));    

         input.close();
  }
}