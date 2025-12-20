import java.util.Scanner;

public class CalculateSimpleInterest {

    //Calculate Simple Interest 
    public void calculateSimpleInterest(float principal, float rate, float time){
        float simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is: " + simpleInterest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking Input from user
        System.out.println("Enter Pricipal Amount: ");
        float principal = sc.nextFloat();
        System.out.println("Enter Rate of Interest: ");
        float rate = sc.nextFloat();
        System.out.println("Enter Time Period: ");
        float time = sc.nextFloat();
        
        CalculateSimpleInterest obj = new CalculateSimpleInterest();
        obj.calculateSimpleInterest(principal, rate, time);
    }
}
