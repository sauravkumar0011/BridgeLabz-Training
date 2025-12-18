import java.util.Scanner;

class DistanceConverter{

  public static void main(String[] args)
 {
   //Taking input using scanner class
   Scanner input = new Scanner(System.in);

   System.out.print("Enter distance in feet : ");
   double distInFeet = input.nextDouble();
   
  //Calculating distance in yard and miles
  double distInYards = distInFeet/3;
  double distInMiles = distInYards/1760;
  
//Printing output
System.out.println("Distance in feet is  " + distInFeet + " while in yards is " + distInYards + " and in miles is " + distInMiles);
  }

}