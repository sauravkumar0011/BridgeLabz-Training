import java.util.*;

public class RemoveSpecificCharacter {

    //Method to remove a specific character from string
    public static String removeCharacter(String str, char removeChar) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch != removeChar) {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Enter character to remove:");
        char removeChar = sc.next().charAt(0);

        String modifiedString = removeCharacter(str, removeChar);

        System.out.println("Modified String: " + modifiedString);

        sc.close();
    }
}
