//Creating Class with name SumOfNumber indicating the purpose is to 
//find the sum of numbers until the user enters 0
import java.util.Scanner;

class NumbersSum {
          public static void main(String[] args){
              //Create double variable with name total, userInput;
              double total = 0.0;
              double userInput = 1;
                
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
             //Using while loop to find the sum of numbers until the user enters 0
             while(true)
             {
              total+=total;
              System.out.print("Enter the number ");          //Taking the input from user
              userInput = input.nextInt();
              if(userInput==0)
              break;
             }
                             
             //Display the total value
             System.out.print("Total value is: " + total);  
             input.close();
        }
}