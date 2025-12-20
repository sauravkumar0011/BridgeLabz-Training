import java.util.Scanner;

public class CheckNumberSign {

    //checking whether a number is positive, negative, or zero
    public int checkNumberSign(int number){
          if(number > 0) 
             {
               return 1;
             }
             else if(number < 0)
             {
              return -1;
             }
             else 
             {
              return 0;
             }
     }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking Input from user
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        
        //Calling the function checkNumberSign
        CheckNumberSign obj = new CheckNumberSign();
        int result = obj.checkNumberSign(number);
        System.out.println(result);

        input.close();
    }
}
