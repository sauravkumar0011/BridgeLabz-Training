// Creating a class named FindFactorUsingWhile to find and print the factors of a given positive number
import java.util.Scanner;

class FindFactorUsingWhile {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking a number as input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking  number is a positive integer and print result
        if (number > 0) {
            System.out.println("Factors of " + number + " are:");
            int i = 1;
            while (i < number ) {
                if (number % i == 0)
                   System.out.println(i);
                   i++;
            }
        } 
        else
            System.out.println("Please enter a positive integer");

         input.close();
    }
}
