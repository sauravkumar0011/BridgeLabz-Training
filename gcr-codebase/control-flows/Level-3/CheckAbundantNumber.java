// Creating a class named CheckAbundantNumber purpose to check if a number is an Abundant Number
import java.util.Scanner;

class CheckAbundantNumber {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking number as input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;
        // Using for loop to find sum of divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i; // Adding divisor to sum
            }
        }

        // Checking and displaying the result
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else 
        {
            System.out.println(number + " is not an Abundant Number");
        }

        input.close();
    }
}
