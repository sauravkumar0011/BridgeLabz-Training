import java.util.Scanner;

class BasicCalculator {
          public static void main(String[] args){
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
              //Taking two numbers as input
              System.out.print("Enter a number1: ");
              float number1 = input.nextFloat(); 
              System.out.print("Enter a number2: ");
              float number2 = input.nextFloat();  

             //Display the result.
             System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + "and" + number2 + " is" + (number1+number2) + ", " + (number1-number2)  +  ", " +  (number1*number2) +  ", " + (number1/number2));   
    
             input.close();
        }
}