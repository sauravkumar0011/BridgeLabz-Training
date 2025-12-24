import java.util.*;

public class PalindromeCheck{

        //Method to check palindrome string
        public static boolean palindromeStringCheck(String str){
                    String reverse = "";
                    for(int i=str.length()-1 ; i >= 0; i--)
                    {
                      reverse += str.charAt(i);
                    }
                    
                    if(reverse.equals(str)) 
                          return true;

               return false;                   
          }
          
          public static void main(String[] args){
                    
                    Scanner sc = new Scanner(System.in);
                    
                    System.out.println("Enter your String : ");
                    String str = sc.nextLine();
                    
                    boolean isPalindrome = PalindromeCheck.palindromeStringCheck(str);
                    if(isPalindrome)
                    System.out.println("String is palindrome");
                    else
                    System.out.println("String is not palindrome");

                    sc.close();
          }
} 