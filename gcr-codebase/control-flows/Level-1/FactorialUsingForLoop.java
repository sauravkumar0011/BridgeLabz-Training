//Creating Class with name FactorialUsingForLoop indicating the purpose is to find factorial of number 
import java.util.Scanner;

class FactorialUsingForLoop {
          public static void main(String[] args){
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
              //Taking a number as input
              System.out.print("Enter a number: ");
              int number = input.nextInt(); 

              //Find factorial using for loop 
               int fac = 1;
               if(number > 0)
              {
                for(int i = number; i > 0 ; i-- )
                {
                 fac *= i;
                 }
               }

             //Printing results
             System.out.println("Factorial of number " + number + " is  " + fac);
          
    
             input.close();
           }
}