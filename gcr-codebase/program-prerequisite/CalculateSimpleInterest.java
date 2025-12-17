import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pricipal Amount: ");
        float Principal = sc.nextFloat();

        System.out.println("Enter Rate of Interest: ");
        float Rate = sc.nextFloat();

        System.out.println("Enter Time Period: ");
        float Time = sc.nextFloat();

        float simpleInterest = (Principal * Rate * Time) / 100;
        System.out.println("Simple Interest is: " + simpleInterest);
    }
}
