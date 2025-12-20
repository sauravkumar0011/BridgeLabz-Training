import java.util.Scanner;

public class DivideChocolates {

    //Finds Remainder And Quotient
   public static int[] divideChocolates(int number, int divisor, int[] arr) {
          arr[0] = number % divisor;
          arr[1] = number / divisor;

          return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking Input from user
        System.out.println("Enter the numberOfchocolates : ");
        int number = input.nextInt();
        System.out.println("Enter the numberOfChildren: ");
        int divisor = input.nextInt();

        int[] arr = new int[2];
        
        //Calling the function divideChocolates
        arr = DivideChocolates.divideChocolates(number, divisor, arr);
        System.out.println("number of remaining chocolates is : " + arr[0]);
        System.out.println("The number of chocolates each child gets is : " + arr[1]);

        input.close();
    }
}
