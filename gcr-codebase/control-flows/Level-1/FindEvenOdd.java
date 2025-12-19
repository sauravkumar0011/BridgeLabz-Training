//Creating Class with name FindEvenOdd indicating the purpose is to find even and odd number 
import java.util.Scanner;

class FindEvenOdd {
          public static void main(String[] args){
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
              //Taking a number as input
              System.out.print("Enter a number: ");
              int number = input.nextInt(); 

              //Print even and odd number using for loop
                for(int i = number; i > 0 ; i-- )
                {
                  if(i % 2 ==0)
                  System.out.println("Even number " + i );
                  else
                  System.out.println("Odd number " + i );
                 }          
    
             input.close();
           }
}