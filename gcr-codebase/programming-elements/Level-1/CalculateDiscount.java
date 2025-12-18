import java.util.Scanner;

class CalculateDiscount{

  public static void main(String[] args)
 {
   //Taking input using scanner class
   Scanner input = new Scanner(System.in);
   System.out.print("Enter student fee : ");
   double fee = input.nextDouble();
   System.out.print("Enter University Discount : ");
   double discountPercent = input.nextDouble();;

  //Calculating discounted amount and price
  double discount = fee * (discountPercent/100);
  double finalFee = fee - discount;
  
//printing output
System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
  }

}