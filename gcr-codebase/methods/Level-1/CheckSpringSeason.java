import java.util.Scanner;

public class CheckSpringSeason {

    //Checking Its a Spring Season or Not a Spring Season.
    public boolean checksSpringSeason(int month, int day){
      boolean IsSpringSeason = 
             (month == 3 && day >= 20 && day <= 31) ||
             (month == 4 || month == 5 && day >= 1 && day <= 31) ||
             (month == 5 && day >= 20 && day <= 31);
             
             return IsSpringSeason;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking two int values month and day as input
        System.out.print("Enter Month: ");
        int month = input.nextInt(); 
        System.out.print("Enter day: ");
        int day = input.nextInt(); 
        
        //Calling the function checkSpringSeason
        CheckSpringSeason obj = new CheckSpringSeason();
        boolean result = obj.checksSpringSeason(month, day);
        System.out.print(result);

        input.close();
    }
}
