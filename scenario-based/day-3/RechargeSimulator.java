/*
 Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.
*/

import java.util.Scanner;

public class RechargeSimulator {

    // Method to handle recharge and offers
    public static double recharge(String operator, double amount, double balance) {

        switch (operator) {

            case "Jio":
                System.out.println("Offer: Extra 1GB data valid for 1 day");
                break;

            case "Airtel":
                System.out.println("Offer: Unlimited calls for 2 days");
                break;

            case "Vi":
                System.out.println("Offer: 100 SMS free");
                break;

            default:
                System.out.println("Invalid operator");
                return balance;
        }

        // Add recharge amount to balance
        balance += amount;
        System.out.println("Recharge successful!");

        return balance;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 0;

        while (true) {
            System.out.print("\nEnter mobile operator (Jio/Airtel/Vi) or Stop: ");
            String operator = sc.nextLine();

            if (operator.equalsIgnoreCase("Stop")) {
                System.out.println("Thank you for using Recharge Simulator");
                break;
            }

            System.out.print("Enter recharge amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            balance = recharge(operator, amount, balance);

            System.out.println("Current Balance: ₹" + balance);
        }

        sc.close();
    }
}
