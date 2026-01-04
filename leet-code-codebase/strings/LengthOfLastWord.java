import java.util.*;

public class LengthOfLastWord {

 public static int FindsLengthOfLastWord(String s) {
        int size = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && size == 0) {
                continue;  
            } 
            else if (s.charAt(i) == ' ') {
                return size; 
            } 
            else {
                size++; 
            }
        }
        return size;
    }

    public static void main(String[] args) {

        String s = "   Hello World   ";
        int result = FindsLengthOfLastWord(s);

        System.out.println("Length of last word: " + result);
    }
}
