// Creating a class named MultipleOfNumberUsingWhile prupose to find and print all multiples of a given number below 100
import java.util.Scanner;

class MultipleOfNumberUsingWhile {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking a number as input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking whether the number is positive and printing number
        if (number > 0 && number < 100) {
                       int counter = 100;
                       while (counter > 1) {
                             if (counter % number == 0) {
                                  System.out.println(counter);
                              }
                        }
        } 
        else 
            System.out.println("Please enter a positive number less than 100");

        input.close();
    }
}
