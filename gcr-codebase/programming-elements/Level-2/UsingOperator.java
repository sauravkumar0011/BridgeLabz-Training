import java.util.Scanner;

class UsingOperator {
          public static void main(String[] args){
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
              //Taking two numbers as input
              System.out.print("Enter first number: ");
              float number1 = input.nextFloat(); 
              System.out.print("Enter second number: ");
              float number2 = input.nextFloat();  

             //Display the result.
             System.out.println("The Quotient is " + number1/number2 + "and Remainder is" + number1%number2 + " of two number" + number1 + "and " + number2);   
    
             input.close();
        }
}