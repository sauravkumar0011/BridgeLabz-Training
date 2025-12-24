import java.util.*;

public class SubstringOccurences {

    //Method to count substring occurrences
    public static int countSubstring(String str, String sub) {

        int count = 0;
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            boolean found = true;

            for (int j = 0; j < sub.length(); j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the full string:");
        String str = sc.nextLine();

        System.out.println("Enter the substring:");
        String sub = sc.nextLine();

        int result = countSubstring(str, sub);

        System.out.println("Substring occurs " + result + " times");

        sc.close();
    }
}
