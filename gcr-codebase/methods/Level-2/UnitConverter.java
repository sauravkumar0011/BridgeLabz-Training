import java.util.Scanner;

public class UnitConverter {

    //Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
          double km2miles = 0.621371;
          return km * km2miles;
    }
    
    //Method to convert miles to kilometer
    public static double convertMilesToKm(double miles){
          double miles2km = 1.60934;
          return miles * miles2km;
    }

    // Method to convert feet to meters
    public static double converFeetToMeters(double feet){
         double feet2meters = 0.3048;
          return feet * feet2meters;
    }
    
     //Method to convert meters to feet 
    public static double convertmeterToFeet(double meters){
          double meters2feet = 3.28084;
          return meters * meters2feet;
    }

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

         //Take a number as input 
         System.out.println("Enter Km: ");
         double km = input.nextInt();
         System.out.println("Enter miles: ");
         double miles = input.nextInt();
         System.out.println("Enter feet: ");
         double feet = input.nextInt();
         System.out.println("Enter meter: ");
         double meter = input.nextInt();

         System.out.println("Distance in miles is: " + convertKmToMiles(km));
         System.out.println("Distance in km is: " + convertMilesToKm(miles));
         System.out.println("Distance in meters is: " + converFeetToMeters(feet));
         System.out.println("Distance in feet is: " + convertmeterToFeet(meter));
         
         input.close();
    }
}
