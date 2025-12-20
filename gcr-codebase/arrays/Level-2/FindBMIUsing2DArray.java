//creating a class named FindBMIUsing2DArray purpose to calculate BMI and weight status
import java.util.Scanner;

class FindBMIUsing2DArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Take input for number of persons
        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        double[][] personData = new double[n][3];
        String[] status = new String[n];

        //Take input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Enter weight : ");
            personData[i][0] = input.nextDouble();
            if (personData[i][0] <= 0) {
                System.out.println("Enter positive value : ");
                i--;
                continue;
            }
            System.out.print("Enter height: ");
            personData[i][1] = input.nextDouble();
            if (personData[i][1] <= 0) {
                System.out.println("Enter positive value ");
                i--;
                continue;
            }
                personData[i][1] = personData[i][1] / 100;
        }

        //calculate BMI and determine weight status
        for (int i = 0; i < n; i++) {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            if (personData[i][2] <= 18.4) {
                status[i] = "Underweight";
            } 
            else if (personData[i][2] <= 24.9) {
                status[i] = "Normal";
            }
            else if (personData[i][2] <= 39.9) {
                status[i] = "Overweight";
            } 
            else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height is: " + personData[i][1]);
            System.out.println("Weight is : " + personData[i][0]);
            System.out.println("BMI is : " + personData[i][2]);
            System.out.println("Status is : " + status[i]);
            System.out.println();
        }

        input.close();
    }
}