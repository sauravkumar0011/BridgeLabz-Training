import java.util.ArrayList;
import java.util.List;

class AddToArrayForm {

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            result.add(0, k % 10);
            k /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int k = 34;

        System.out.println(addToArrayForm(num, k));
    }
}
