//Creating Class with name Countdown indicating the purpose is to check count down using for-loop
import java.util.Scanner;

class Countdown {
          public static void main(String[] args){
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
              //Taking a int values as input
              System.out.print("Enter number ");
              int counter = input.nextInt(); 
                          
             //Using for loop to perfom countdown.
             for(int i = counter; i > 0; i--)
             {
              System.out.println("Counter : " + i);
             }
                             
             input.close();
        }
}