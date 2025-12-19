//Creating a class named StudentVotingEligibility purpose to check whether the student can vote or cannot
import java.util.Scanner;

class StudentVotingEligibility {

    public static void main(String[] args) {
        //Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        //Taking student age using array as input
        System.out.print("Enter ten integers: ");
        int[] arr = new int[10];
        for(int i = 0; i<arr.length; i++)
             arr[i] = input.nextInt();

        //Checking each student's age using for loop and displaying result 
        for(int i = 0; i < arr.length; i++) 
             if (arr[i] <= 0) {
                System.out.println("Invalid age");
             } 
             else if (arr[i] >= 18) {
                System.out.println("The student with the age " + arr[i] + " can vote");
             } 
             else {
                System.out.println("The student with the age " + arr[i] +  " cannot vote");
             }

        input.close();
    }
}
