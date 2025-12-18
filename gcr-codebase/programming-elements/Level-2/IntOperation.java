import java.util.Scanner;

class IntOperation {
          public static void main(String[] args){
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
              //Taking a,b,c integer as input
              System.out.print("Enter first number: ");
              int a = input.nextInt(); 
              System.out.print("Enter second number: ");
              int b = input.nextInt();
              System.out.print("Enter third number: ");
              int c = input.nextInt();  

             //Display the result.
             System.out.println("The results of Int Operations are " + a + b *c + ", " + a * b + c + ", " + c + a / b + ", " + a % b + c);   
    
             input.close();
        }
}