import java.util.*;

class ReturnCharacters
{
         public  char[] convertToCharArrayManual(String str)
         {
                   char[]  arrChar = new char[str.length()];
                   for(int i = 0; i < str.length(); i++)
                        arrChar[i] = str.charAt(i);
                     
                   return arrChar;
         }
       
        public  char[] convertToCharArrayInbuilt(String str)
        {
                 char[]  arrChar = new char[str.length()-1];
                 arrChar = str.toCharArray(); 

                 return arrChar;
        }
      
       public  boolean compareTwoString(char[] first, char[] second)
         {
                   boolean result = false;
                   if(first.length != second.length)
                         return result;
              
                   for(int i = 0; i < first.length; i++)
                   {
                        if(first[i] == second[i])
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
                  System.out.println("Enter String : ");
                  String str  = input.next();

                  ReturnCharacters returnCharacters = new ReturnCharacters();
                                    
                  //Display the result
                  char[] s1 = returnCharacters.convertToCharArrayManual(str);
                  char[] s2 = returnCharacters.convertToCharArrayInbuilt(str);
                  boolean result = returnCharacters.compareTwoString(s1 , s2);
                  if(result)
                  System.out.println("String is same");
                  else
                   System.out.println("String is not same");
         }
}