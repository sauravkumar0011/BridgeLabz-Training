import java.util.*;

public class MostFrequentCharacter {

    //Method to find most frequent character
    public static char findMostFrequentChar(String str) {

        int maxCount = 0;
        char mostFrequent = '\0';

        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = currentChar;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        char result = findMostFrequentChar(str);

        System.out.println("Most Frequent Character: '" + result + "'");

        sc.close();
    }
}
