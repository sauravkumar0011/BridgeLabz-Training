import java.util.Scanner;

public class FindRounds {

    //Calculate Calculate the number of rounds must the athlete complete
    public void calculateNumberOfRounds(float firstSide, float secondSide, float thirdSide, int distance){
        float perimeter = firstSide + secondSide + thirdSide;
        float rounds = perimeter / distance;
        System.out.println("Number of rounds must the athlete complete is: " + rounds);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking Input from user
        System.out.println("Enter First Side of Triangle (m): ");
        float firstSide = sc.nextFloat();
        System.out.println("Enter Second Side of Triangle (m): ");
        float secondSide = sc.nextFloat();
        System.out.println("Enter Third Side of Triangle (m): ");
        float thirdSide = sc.nextFloat();
        
        int distance = 5;

        FindRounds obj = new FindRounds();
        obj.calculateNumberOfRounds(firstSide, secondSide, thirdSide, distance);
    }
}
