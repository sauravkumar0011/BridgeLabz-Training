import java.util.*;

class DemostarteOutOfBoundsException
{
         public void generateException(String text)
         {
                      text.charAt(text.length() + 1);
         }
       
        public void demonstrateStringIndexOutOfBoundsException(String text)
        {
                 try{                                          
                      text.charAt(text.length() + 1);
                 }
                 catch(StringIndexOutOfBoundsException e){
                      System.out.println("StringIndexOutOfBoundsException is : " + e.getMessage());
                 }
                 catch(Exception e){
                      System.out.println("Generic Exception : " + e.getMessage());
                 }
        }

        public static void main(String[] args)
        {
                  Scanner input = new Scanner(System.in);
                  System.out.println("Enter String : ");
                  String str  = input.next();

                  DemostarteOutOfBoundsException obj = new DemostarteOutOfBoundsException();
                  try{
                       obj.generateException(str);
                  }
                  catch(java.lang.StringIndexOutOfBoundsException e){
                       obj.demonstrateStringIndexOutOfBoundsException(str);
                       System.out.println("StringIndexOutOfBoundsException is: " + e.getMessage());
                  }
                                                      
         }
}