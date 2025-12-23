import java.util.*;

class NullPointerExceptionHandling
{
         public void generateException()
         {
                   String text = null;
                   text.length();
         }
       
        public void demonstrateException()
        {
                 String text = null;
                 try{
                      text.length();
                 }
                 catch(NullPointerException e){
                      System.out.println("NullPointerException is : " + e.getMessage());
                 }
                 catch(Exception e){
                      System.out.println("Generic Exception : " + e.getMessage());
                 }
        }

        public static void main(String[] args)
        {
                  Scanner input = new Scanner(System.in);
                 
                  NullPointerExceptionHandling obj = new NullPointerExceptionHandling();
                  try{
                       obj.generateException();
                  }
                  catch(java.lang.NullPointerException e){
                       obj.demonstrateException();
                       System.out.println("NullPointerException is: " + e.getMessage());
                  }
                                                      
         }
}