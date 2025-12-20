import java.util.Scanner;

public class NaturalNumSum {

    //calculating sum of natural number
    public int naturalNumSum(int number){
          int sum = 0;
          for(int i = 1; i <= number; i++){
                 sum += i;
          }
          return sum;
     }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking Input from user
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        
        //Calling the function naturalNumSum
        NaturalNumSum obj = new NaturalNumSum();
        int result = obj.naturalNumSum(number);
        System.out.println(result);

        input.close();
    }
}
