// Creating a class named LeapYear purpose: To check whether a given year is a Leap Year or not
import java.util.Scanner;

class LeapYear {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking year as input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Checking whether the year is valid 
        //second part
            System.out.println("Using single if statement:");

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
         }
        else{
                System.out.println(year + " is not a Leap Year");
        }
      
        input.close();
    }
}
