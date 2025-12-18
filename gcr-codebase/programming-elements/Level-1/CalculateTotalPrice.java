import java.util.Scanner;

class CalculateTotalPrice{

  public static void main(String[] args)
 {
   Scanner input = new Scanner(System.in);

   //Taking input from user
   System.out.print("Enter unit price : ");
   double unitPrice = input.nextDouble();
   System.out.print("Enter quantity : ");
   double quantity = input.nextDouble();
   
  //Calculating total price
  double totalPrice = unitPrice *quantity;
   
 //Printing output
 System.out.println("The total purchase price is INR  " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
  }

}