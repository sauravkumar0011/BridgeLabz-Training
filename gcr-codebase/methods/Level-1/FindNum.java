import java.util.Scanner;

public class FindNumber {

    //calculating sum of natural number
   public static int[] findNumber(int number1, int number2, int number3, int arr[]){
          if(number1 > number2 && number1 > number3)
          arr[0] = number1;
          else if(number1 < number2 && number1 < number3)
          arr[1] = number1;
          
          if(number2 > number1 && number2 > number3)
          arr[0] = number2;
          else if(number2 < number1 && number2 < number3)
          arr[1] = number2;
          
          if(number3 > number2 && number3 > number1)
          arr[0] = number3;
          else if(number3 < number2 && number3 < number1)
          arr[1] = number3;
          
          return arr;
     }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking Input from user
        System.out.println("Enter the number1: ");
        int number1 = input.nextInt();
        System.out.println("Enter the number2: ");
        int number2 = input.nextInt();
        System.out.println("Enter the number3: ");
        int number3 = input.nextInt();
        int[] arr = new int[2];
        
        //Calling the function findNumber
        arr = FindNumber.findNumber(number1, number2, number3, arr);
        System.out.println("Largest number is : " + arr[0]);
        System.out.println("Smallest number is : " + arr[1]);

        input.close();
    }
}
