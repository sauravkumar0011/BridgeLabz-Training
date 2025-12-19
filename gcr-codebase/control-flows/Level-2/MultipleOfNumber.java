// Creating a class named MultipleOfNumber prupose to find and print all multiples of a given number below 100
import java.util.Scanner;

class MultipleOfNumber {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking a number as input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking whether the number is positive and printing number
        if (number > 0 && number < 100) {
                       for (int i = 100; i >= 1; i--) {
                             if (i % number == 0) {
                                  System.out.println(i);
                              }
                        }
        } 
        else 
            System.out.println("Please enter a positive number less than 100");

        input.close();
    }
}
