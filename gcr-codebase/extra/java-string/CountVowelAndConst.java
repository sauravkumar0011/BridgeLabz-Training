import java.util.*;

public class CountVowelAndConst{

          //Method to count number of Vowels and Consonants
          public static int CountVowelAndConstants(String str){
                    int vowel = 0;
                    for(int i=0; i < str.length(); i++)
                    {
                      if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' )
                      vowel++;
                    }
                    return vowel;
          }
          
          public static void main(String[] args){
                    
                    Scanner sc = new Scanner(System.in);
                    
                    System.out.println("Enter your String : ");
                    String str = sc.next();
                    
                    int vowel = CountVowelAndConst.CountVowelAndConstants(str);
                    int constant = str.length() - vowel;
                    
                   System.out.println("Number of vowels is : " + vowel);
                   System.out.println("Number of Constants is : " + constant);
                  
                  sc.close();
          }
} 