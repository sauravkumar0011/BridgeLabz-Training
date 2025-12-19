// Creating a class named GreatestFactor purpose is to find the greatest factor of a number
import java.util.Scanner;

class GreatestFactor {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking a number as input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Use for loop to find greatest factor
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0){
                greatestFactor = i;
                break;
            }
        }

        // Displaying the result
        System.out.println("Greatest factor is " + greatestFactor);

        input.close();
    }
}
