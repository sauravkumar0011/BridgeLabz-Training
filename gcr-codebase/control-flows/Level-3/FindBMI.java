// Creating a class named FindBMI purpose to calculate BMI and determine weight status
import java.util.Scanner;

class FindBMI {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking weight and height as input
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        // Converting height from cm to meters and calculating BMI
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        //Display weight status of the person
        if (bmi <= 18.4) {
             System.out.println("Weight Status: Underweight");
        } 
        else if (bmi >= 18.5 && bmi <= 24.9) {
             System.out.println("Weight Status: Normal");
        } 
        else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Weight Status:Overweight");
        } 
        else {
             System.out.println("Weight Status:Obese");
        }

        input.close();
    }
}
