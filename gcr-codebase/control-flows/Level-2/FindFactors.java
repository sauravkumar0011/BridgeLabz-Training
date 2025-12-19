// Creating a class named FindFactor to find and print the factors of a given positive number
import java.util.Scanner;

class FindFactors {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking a number as input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking  number is a positive integer and print result
        if (number > 0) {
            System.out.println("Factors of " + number + " are:");

            for (int i = 1; i < number; i++) {
                if (number % i == 0)
                   System.out.println(i);
            }
        } 
        else
            System.out.println("Please enter a positive integer");

         input.close();
    }
}
