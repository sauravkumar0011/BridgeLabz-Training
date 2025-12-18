import java.util.Scanner;

class FindSquareSide {
          public static void main(String[] args){
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
              //Taking perimeter of square as input
              System.out.print("Enter perimeter of square : ");
              float perimeter = input.nextFloat();   

              //Calculate side of square
              float side =  perimeter/4f; 

             //Display the result.
             System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);   
    
             input.close();
        }
}