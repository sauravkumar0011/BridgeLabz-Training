// Creating a class named GreatestFactorUsingWhile  purpose is to find the greatest factor of a number
import java.util.Scanner;

class GreatestFactorUsingWhile {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking a number as input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Use for loop to find greatest factor
        int greatestFactor = 1;
        int counter = number - 1;
        while (counter >= 1) {
                if (number % counter == 0){
                greatestFactor = counter;
                break;
            }
               counter--;
        }

        // Displaying the result
        System.out.println("Greatest factor is " + greatestFactor);

        input.close();
    }
}
