import java.util.*;

public class ReplaceWord {

    //Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {

        String result = "";
        String currentWord = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (currentWord.equals(oldWord)) {
                    result += newWord;
                } else {
                    result += currentWord;
                }
                result += " ";
                currentWord = "";
            }
        }

        if (currentWord.equals(oldWord)) {
            result += newWord;
        } else {
            result += currentWord;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        System.out.println("Enter word to replace:");
        String oldWord = sc.nextLine();

        System.out.println("Enter new word:");
        String newWord = sc.nextLine();

        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        System.out.println("Modified Sentence: " + modifiedSentence);

        sc.close();
    }
}
