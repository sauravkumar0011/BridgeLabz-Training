import java.util.*;

public class LongestPalindrome {

    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int length = 0;
        boolean oddFound = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int count : map.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                oddFound = true;
            }
        }

        if (oddFound) {
            length++;
        }

        return length;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
