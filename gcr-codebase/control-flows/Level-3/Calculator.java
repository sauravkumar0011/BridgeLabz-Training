// Creating a class named Calculator purpose to perform basic arithmetic operations
import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking first number as input
        System.out.print("Enter first number: ");
        double first = input.nextDouble();
        System.out.print("Enter second number: ");
        double second = input.nextDouble();
        System.out.print("Enter operator: ");
        String op = input.next();

        // Using switch case to perform calculation and display result
        int number = 2;
        for (int i = 1; i < number; i++){
        switch (op) {
            case "+":
                System.out.println("Result = " + (first + second));
                break;

            case "-":
                System.out.println("Result = " + (first - second));
                break;

            case "*":
                System.out.println("Result = " + (first * second));
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result = " + (first / second));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
       }

        input.close();
    }
}
