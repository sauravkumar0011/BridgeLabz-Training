//Creating Class with name NaturalNumSum indicating the purpose is to find and check sum of natural number 
import java.util.Scanner;

class NaturalNumSum {
          public static void main(String[] args){
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
              //Taking a number as input
              System.out.print("Enter a number: ");
              double number = input.nextDouble(); 

              //Find sum of natural number using while loop
              double temp = number;
              double sum=0;
              if(temp>0)
              {
                while(temp > 0)
                {
                 sum += temp;
                 temp--;
                 }
              }

             //Find sum of natural number using formula
             double sumUsingFormula=0.0;
             if(number >= 0) 
             {
               sumUsingFormula =  (number*(number+1)/2);
             }

             //Compare the two results and print the result
              if(number == sumUsingFormula)
              {
               System.out.println("The sum of natural number using while loop is : " + number);
               System.out.println("The sum of natural number using formula is: " + sumUsingFormula);
               }
             else
             {
              System.out.println("The number " + number + " is not a natural number ");
             }
    
             input.close();
           }
}