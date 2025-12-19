// Creating a class named FindPowerOfNumberUsingWhile purpose to calculate the power of a number 
import java.util.Scanner;

class FindPowerOfNumberUsingWhile {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking number and power as input
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Checking whether both number and power are positive integers and calculating result using for loop
        if (number > 0 && power > 0) {
             int result = 1;
             int counter = 0;
            while (counter < power) {
                result = result * number;
            }
            System.out.println(number + " raised to the power " + power + " is: " + result);
        } 
        else {
            System.out.println("Please enter positive integers for number and power");
        }

        input.close();
    }
}
