import java.util.*;

class DemostarteIllegalArgumentException
{
         public void generateException(String text, int start, int end)
         {
                   text.substring(start, end);
         }
       
        public void demonstrateException(String text, int start, int end)
        {
                 try{
                      text.substring(start, end);
                 }
                 catch(IllegalArgumentException e){
                      System.out.println("DemostarteIllegalArgumentException is : " + e.getMessage());
                 }
                 catch(RuntimeException e){
                      System.out.println("Generic Exception : " + e.getMessage());
                 }
        }

        public static void main(String[] args)
        {
                  Scanner input = new Scanner(System.in);
                  
                  System.out.println("Enter the String : ");  
                  String str = input.next();
                  System.out.println("Enter fist Index : ");  
                  int first = input.nextInt();
                  System.out.println("Enter last Index : ");  
                  int last = input.nextInt();

                  DemostarteIllegalArgumentException obj = new DemostarteIllegalArgumentException();
                  try{
                       obj.generateException(str, first, last);
                  }
                  catch(Exception e){
                       obj.demonstrateException(str, first, last);
                       System.out.println("DemostarteIllegalArgumentException is: " + e.getMessage());
                  }
                                                      
         }
}