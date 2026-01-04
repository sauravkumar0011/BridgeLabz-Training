import java.util.*;

public class ReverseString {

    public static void reverse(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverse(s);
        System.out.println(Arrays.toString(s));
    }
}
