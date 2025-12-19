// Creating a class named CheckPrimeNumberCheck purpose to check whether a given number is a Prime Number or not
import java.util.Scanner;

class CheckPrimeNumber {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking number as input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking divisibility using for loop
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } 
        else {
            for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
             }
         } 

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } 
        else {
            System.out.println(number + " is not a Prime Number");
        }

        input.close();
    }
}
