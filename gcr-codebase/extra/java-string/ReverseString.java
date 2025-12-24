import java.util.*;

public class ReverseString{

          //Method to reverse string
          public static String reverseString(String str){
                    String reverse = "";
                    for(int i=str.length()-1 ; i >= 0; i--)
                    {
                      reverse += str.charAt(i);
                    }
                    return reverse;
          }
          
          public static void main(String[] args){
                    
                    Scanner sc = new Scanner(System.in);
                    
                    System.out.println("Enter your String : ");
                    String str = sc.nextLine();
                    
                    String reverse = ReverseString.reverseString(str);
                    System.out.println("Reversed String is : " + reverse);
                  
                    sc.close();
          }
} 