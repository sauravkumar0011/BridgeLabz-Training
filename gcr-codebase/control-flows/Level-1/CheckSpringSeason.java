//Creating Class with name CheckSpringSeason indicating the purpose is to check 
//Its a Spring Season or Not a Spring Season
import java.util.Scanner;

class CheckSpringSeason {
          public static void main(String[] args){
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
              //Taking two int values month and day as input
              System.out.print("Enter Month: ");
              int month = input.nextInt(); 
              System.out.print("Enter day: ");
              int day = input.nextInt(); 
             
             //Checking Its a Spring Season or Not a Spring Season.
             boolean IsSpringSeason = 
             (month == 3 && day >= 20 && day <= 31) ||
             (month == 4 || month == 5 && day >= 1 && day <= 31) ||
             (month == 5 && day >= 20 && day <= 31);

             if(IsSpringSeason)
             {
              System.out.println("Its a Spring Season");
             }
             else
             {
              System.out.println("Not a Spring Season");
             }
               
             input.close();
        }
}