import java.util.*;

public class CompareStrings {

    //Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {

        int minLength = str1.length() < str2.length() ? str1.length() : str2.length();

        for (int i = 0; i < minLength; i++) {

            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 != ch2) {
                return ch1 - ch2; 
            }
        }

        return str1.length() - str2.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        int result = compareStrings(str1, str2);

        if (result == 0) {
            System.out.println("Both strings are equal");
        } else if (result < 0) {
            System.out.println("First string comes before second string");
        } else {
            System.out.println("First string comes after second string");
        }

        sc.close();
    }
}
