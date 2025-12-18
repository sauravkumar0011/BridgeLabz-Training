import java.util.Scanner;

class DiscountedAmount{

  public static void main(String[] args)
 {

  //Calculating discounted amount and price
  int fee = 125000;
  int discountPercent = 10;
  double discount = fee * (0.1);
  double finalFee = fee - discount;
  
//printing output
System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
  }

}