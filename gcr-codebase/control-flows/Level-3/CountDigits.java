// Creating a class named CountDigits purpose to count the number of digits in a given integer
import java.util.Scanner;

class CountDigits {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking an integer as input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int count = 0;
        int temp = number;
        // Using while loop to count digits
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        // Displaying the number of digits in number
        System.out.println("The number of digits in " + number + " is: " + count);

        input.close();
    }
}
