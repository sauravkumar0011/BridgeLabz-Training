// Creating a class named StudentVotingEligibility purpose to check whether the student can vote or cannot
import java.util.Scanner;

class StudentVotingEligibility {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking five numbers using array as input
        System.out.print("Enter ten integers: ");
        int[] arr = new int[5];
        for(int i = 0; i<arr.length; i++)
             arr[i] = input.nextInt();

        //Checking numbers and displaying result 
        for(int i = 0; i < arr.length; i++) 
             if (arr[i] >= 0) {
                  if(arr[i] % 2 ==0)
                     System.out.println("Number is Even " + arr[i]);
                  else
                     System.out.println("Number is Odd " + arr[i]);
             } 
             else if (arr[i] < 0) {
                System.out.println("Number is Zero");
             } 
             else {
                System.out.println("Number is negative");
             }

        //Comparing first and last element of array
        int lastElement = arr.length - 1;
             if (arr[0] == arr[lastElement]) {
                System.out.println("First and last are equal");
             } 
             else if (arr[0] < arr[lastElement]) {
                System.out.println("First element is less");
             } 
             else {
                System.out.println("First element is greater");
             }

        input.close();
    }
}
