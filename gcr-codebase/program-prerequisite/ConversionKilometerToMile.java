import java.util.Scanner;

class ConversionKilometerToMile{

  public static void main(String[] args)
 {
   //Taking Input from user
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter distance in Kilometer : ");
  double kilometer = sc.nextInt();

  //Calculating result in miles
  double result = kilometer * 0.621371;

  //Printing result
  System.out.println("Distance in miles is : " + result);
 }

}