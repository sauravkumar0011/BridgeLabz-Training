import java.util.Scanner;

class IntOperation {
          public static void main(String[] args){
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
              //Taking a,b,c double variable as input
              System.out.print("Enter first number: ");
              double a = input.nextDouble(); 
              System.out.print("Enter second number: ");
              double b = input.nextDouble();
              System.out.print("Enter third number: ");
              double c = input.nextDouble();  

             //Display the result.
             System.out.println("The results of Int Operations are " + a + b *c + ", " + a * b + c + ", " + c + a / b + ", " + a % b + c);   
    
             input.close();
        }
}