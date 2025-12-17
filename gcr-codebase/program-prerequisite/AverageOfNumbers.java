import java.util.Scanner;

class AverageOfNumbers{

  public static void main(String[] args)
 {
   //Taking Input from user
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter three numbers : ");
  int num1 = sc.nextInt();
  int num2 = sc.nextInt();
  int num3 = sc.nextInt();

  //Calculating average of three numbers
  int average = (num1+num2+num3)/3;

  //Printing result
  System.out.println("Average of three numbers is: " + average);
 }

}