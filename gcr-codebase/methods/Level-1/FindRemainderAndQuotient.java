import java.util.Scanner;

public class FindRemainderAndQuotient {

    //Finds Remainder And Quotient
   public static int[] findRemainderAndQuotient(int number, int divisor, int[] arr) {
          arr[0] = number % divisor;
          arr[1] = number / divisor;

          return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking Input from user
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        System.out.println("Enter the Divisor: ");
        int divisor = input.nextInt();

        int[] arr = new int[2];
        
        //Calling the function findRemainderAndQuotient
        arr = FindRemainderAndQuotient.findRemainderAndQuotient(number, divisor, arr);
        System.out.println("Remainder is : " + arr[0]);
        System.out.println("Quotient is : " + arr[1]);

        input.close();
    }
}
