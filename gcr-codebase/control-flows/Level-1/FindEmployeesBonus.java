//Creating Class with name FindEmployeesBonus indicating the purpose is to 
//find bonus of employees based on their years of service. 
import java.util.Scanner;

class FindEmployeesBonus {
          public static void main(String[] args){
              //Create a Scanner Object
              Scanner input = new Scanner(System.in);
          
              //Taking a number as input
              System.out.print("Enter your salary: ");
              int salary = input.nextInt(); 
              System.out.print("Enter your year of service: ");
              int year = input.nextInt(); 


              //Checking Employees bonus eligibility and print bonus amount
              if( year > 5)
                System.out.println("Bonus amount is " +  salary*0.05);
              else
                 System.out.println("Not eligible for bonus");
                    
    
             input.close();
           }
}