import java.util.*;

public class AnagramStrings {

    //Method to check if two strings are anagrams
    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        boolean[] matched = new boolean[str2.length()];

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            boolean found = false;

            for (int j = 0; j < str2.length(); j++) {
                if (!matched[j] && ch1 == str2.charAt(j)) {
                    matched[j] = true;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        boolean result = isAnagram(str1, str2);

        if (result) {
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams");
        }

        sc.close();
    }
}
