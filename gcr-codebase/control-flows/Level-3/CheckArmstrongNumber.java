// Creating a class named ArmstrongNumberCheck purpose to check number is an Armstrong number or not
import java.util.Scanner;

class ArmstrongNumberCheck {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking number as input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;
        int originalNumber = number;

        // Using while loop to extract each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum = sum + (digit * digit * digit);
            originalNumber = originalNumber / 10;
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } 
        else {
            System.out.println(number + " is not an Armstrong Number");
        }

        input.close();
    }
}
