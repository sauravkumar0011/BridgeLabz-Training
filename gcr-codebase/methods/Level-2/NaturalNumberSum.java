import java.util.Scanner;

public class NaturalNumberSum {

    //Method to find sum of natural number using recursion
    public static int FindSumUsingRecursion(int number) {
      if(number > 0){
         if(number == 0)
            return n;
         else
            return n+FindSumUsingRecursion(number - 1)
      }
     }

    //Method to find sum of natural number using formulae
    public static int FindSumUsingFormulae(int[] factors) {
       return number * (number + 1)/2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take a number as input 
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("\nSum of factors: " + findSum(factors));
        System.out.println("Product of factors: " + findProduct(factors));
        System.out.println("Sum of squares of factors: " + findSumOfSquares(factors));

        input.close();
    }
}
