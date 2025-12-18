import java.util.Scanner;

class HeightMeasurementConverter{

  public static void main(String[] args)
 {
   Scanner input = new Scanner(System.in);

   //Taking height as input 
   System.out.print("Enter height in cm : ");
   double height = input.nextDouble();

   //Convert cm to inches
    double totalInches = height/2.54;

  //Calculate height in cm to feet and inches
  double heightInInches = totalInches %12;
  double heightInFeet =  totalInches/12;
  
//printing output
System.out.println("Your  Height in cm is " + height + " while in feet is " + heightInFeet + " and inches is " + heightInInches);
  }

}