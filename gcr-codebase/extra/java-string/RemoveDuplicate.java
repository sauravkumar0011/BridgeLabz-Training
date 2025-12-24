import java.util.*;

public class RemoveDuplicate{

        //Method to remove duplicate characters from string
        public static String removeDuplicates(String str){
                   if(str == null || str.length() < 2)
                       return str;   
                   
                   boolean[] seen = new boolean[256];
                   String modified = "";          
                  
                   for(int i = 0; i < str.length(); i++) 
                   {
                      char current = str.charAt(i);
                      if(!seen[current])
                      {
                        seen[current] = true;
                        modified += current;
                      }
                     
                   }
                   return modified;
          }
          
          public static void main(String[] args){
                    
                    Scanner sc = new Scanner(System.in);
                    
                    System.out.println("Enter your String : ");
                    String str = sc.nextLine();
                    
                    String modified = RemoveDuplicate.removeDuplicates(str);

                    System.out.println("Modified String is: " + modified);

                    sc.close();
          }
} 