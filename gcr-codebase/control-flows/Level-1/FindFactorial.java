//Creating Class with name FindFactorial indicating the purpose is to find factorial of number 
import java.util.Scanner;

class FindFactorial {
          public static void main(String[] args){
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
              //Taking a number as input
              System.out.print("Enter a number: ");
              int number = input.nextInt(); 

              //Find factorial using while loop 
               int temp= number;
               int fac = 1;
               if(fac > 0)
              {
                while(temp > 0)
                {
                 fac *= temp;
                 temp--;
                }
               }

             //Printing results
             System.out.println("Factorial of number " + number + " is  " + fac);
          
    
             input.close();
           }
}