import java.util.Scanner;

class TriangleArea {
          public static void main(String[] args){
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
              //Taking base and height of triangle as input
              System.out.print("Enter a base: ");
              float base = input.nextFloat(); 
              System.out.print("Enter a height: ");
              float height = input.nextFloat();  

              //Calculate area of triangle
              float area = 0.5f * (base * height) ; 

             //Display the result.
             System.out.println("Area of traiangle is: " + area);   
    
             input.close();
        }
}