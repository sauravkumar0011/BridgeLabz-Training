import java.util.Scanner;

class MaxHandshake{

  //Calculate maximum number of handshakes
  public void calculateMaxHandshake(int numberOfStudents){
      int handshake = (numberOfStudents * (numberOfStudents - 1)) / 2;
      System.out.println("Maximum number of possible handshakes is " + handshake);
  }

  public static void main(String[] args)
 {
   Scanner input = new Scanner(System.in);

   //Taking input from user
   System.out.print("Enter numberOfStudents : ");
   int numberOfStudents = input.nextInt();  

   MaxHandshake obj = new MaxHandshake();
   obj.calculateMaxHandshake(numberOfStudents);
 }

}