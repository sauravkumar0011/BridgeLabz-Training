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
       
        public static String substringUsingChar(String str, int start, int end)
        {
                  String result = "";
                  for(int i = start; i<end; i++)
                            result += str.charAt(i);
                    
                  return result;
        }
      
        public static String substringUsingInbuilt(String str, int start, int end)
        {
                  String result = "";
                  result = str.substring(start, end);
                                  
                  return result;
        }


        public static void main(String[] args)
        {
                  Scanner input = new Scanner(System.in);
                  
                  //Taking String as input
                  System.out.println("Enter String : ");
                  String str  = input.next();
                  System.out.println("Enter Start Index : ");
                  int start  = input.nextInt();
                  System.out.println("Enter End Index : ");
                  int end  = input.nextInt();


                                    
                  //Display the result
                  String s1 = substringUsingChar(str, start, end);
                  String s2 = substringUsingInbuilt(str, start, end);
                  boolean result = compareTwoString(s1 , s2);
                  if(result)
                  System.out.println("String is same");
                  else
                   System.out.println("String is not same");
         }
}