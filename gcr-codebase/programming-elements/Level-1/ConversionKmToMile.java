import java.util.Scanner;

class ConversionKmToMile{

  public static void main(String[] args)
 {
   //Taking Input from user
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter distance in Km : ");
  double km = sc.nextInt();

  //Calculating result in miles
  double result = km * (1/1.6);

  //Printing result
  System.out.println("The total miles is : " + result + " mile for the given " + km + "km");
 }

}