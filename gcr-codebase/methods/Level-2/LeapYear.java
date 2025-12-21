import java.util.Scanner;

public class LeapYear {

       //Method to find year is leap or not
       public static boolean checkLeapYear(int year){
         if(year >= 1582){
             if((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0))
                return true;
             else
                return false;
          }
             return false;
        }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take a number as input 
        System.out.println("Enter a year: ");
        int year = input.nextInt();

        boolean  result = checkLeapYear(year);
         if(result)
            System.out.println("Leap year");
         else
            System.out.println("Not a leap year");

        input.close();
    }
}
