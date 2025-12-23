import java.util.*;

class CompareString
{
         public static boolean compareTwoString(String first, String second)
         {
                   boolean result = false;
                   if(first.length() != second.length())
                         return result;
              
                   for(int i = 0; i < first.length(); i++)
                   {
                        if(first.charAt(i) == second.charAt(i))
                           result = true;
                        else
                           break;
                   }
                   
                   return result;
         }
         public static void main(String[] args)
         {
                  Scanner input = new Scanner(System.in);
                  
                  //Taking String as input
                  System.out.println("Enter First String : ");
                  String first  = input.next();
                  System.out.println("Enter Second String : ");
                  String second  = input.next();
                   
                  //Display the result
                  boolean result = compareTwoString(first, second);
                  if(result)
                  System.out.println(" String is same");
                  else
                   System.out.println(" String is not same");
         }
}