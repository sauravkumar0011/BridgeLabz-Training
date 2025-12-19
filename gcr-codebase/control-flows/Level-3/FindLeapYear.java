// Creating a class named FinalLeapYear purpose: To check whether a given year is a Leap Year or not
import java.util.Scanner;

class FindLeapYear {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking year as input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Checking whether the year is valid 
        //first part
        if (year >= 1582) {

            System.out.println("Using multiple if-else statements:");
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            }
            else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year");
            }
            else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            }
            else {
                System.out.println(year + " is not a Leap Year");
            }

            //second part
            System.out.println("Using single if statement:");
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }

        }
        else {
            System.out.println("Leap Year calculation is valid only for year 1582 or later");
        }
        input.close();
    }
}
