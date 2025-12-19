//Creating Class with name RocketLaunchCounter indicating the purpose is to check 
//count down the number from the user input value to 1 using a while loop for a rocket launch
import java.util.Scanner;

class RocketLaunchCounter {
          public static void main(String[] args){
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
              //Taking a int values as input
              System.out.print("Enter number ");
              int counter = input.nextInt(); 
                          
             //Using while loop to print the value of the counter and decrement the counter.
             while(counter>0)
             {
              System.out.println("Counter : " + counter);
              counter--;
             }
                             
             input.close();
        }
}