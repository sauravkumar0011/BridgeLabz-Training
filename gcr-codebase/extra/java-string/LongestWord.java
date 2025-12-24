import java.util.*;

public class LongestWord{

        //Method to find longest word in string
        public static String findsLongestWord(String str){
                  String longestWord = "";
                  String currentWord = "";

             for (int i = 0; i < str.length(); i++) {
               
                   char ch = str.charAt(i);
                   if (ch != ' ') {
                       currentWord += ch;
                   } 
                   else {
                           if (currentWord.length() > longestWord.length())
                                  longestWord = currentWord;
                                  
                                 currentWord = "";
                   }
             }
             //Check last word
             if (currentWord.length() > longestWord.length()) 
                     longestWord = currentWord;
              
              return longestWord;
             
         }
          
          public static void main(String[] args){
                    
                    Scanner sc = new Scanner(System.in);
                    
                    System.out.println("Enter a sentence: ");
                    String str = sc.nextLine();
                    
                    String longestWord = LongestWord.findsLongestWord(str);

                    System.out.println("Longest String is: " + longestWord);

                    sc.close();
          }
} 