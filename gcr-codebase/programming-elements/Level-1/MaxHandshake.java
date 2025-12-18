import java.util.Scanner;

class MaxHandshake{

  public static void main(String[] args)
 {
   Scanner input = new Scanner(System.in);

   //Taking input from user
   System.out.print("Enter numberOfStudents : ");
   int numberOfStudents = input.nextInt();
     
  //Calculating maximum number of handshake
  int handshake = (numberOfStudents * (numberOfStudents - 1)) / 2;
   
 //Printing output
 System.out.println("Maximum number of possible handshakes is " + handshake);
  }

}