// Creating a class named CheckHarshadNumber purpose to check if a number is a Harshad Number
import java.util.Scanner;

class CheckHarshadNumber {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking number as input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;
        int originalNumber = number;
        // Using while loop to calculate sum of digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum = sum + digit;
            originalNumber = originalNumber / 10;
        }

        // Checking and displaying if number is divisible by sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is not a Harshad Number");
        }

        input.close();
    }
}
