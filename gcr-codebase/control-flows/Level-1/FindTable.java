//Creating Class with name FindTable indicating the purpose is to find the multiplication table 
import java.util.Scanner;

class FindTable {
          public static void main(String[] args){
              //Create two int variable 
               int num1 = 6;
               int num2 = 9;
              
             //print table using for loop 
            for(int j = num1; j <= num2; j++)
            {
              System.out.println();
              for (int i = 1; i <= 10; i++)
               {
                System.out.println(j + " *  " + i + " = " + j * i );
               }
             }
           }
}