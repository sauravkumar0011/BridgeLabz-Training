import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); // first element is always 1

            for (int j = 1; j < i; j++) {
                int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                row.add(value);
            }

            if (i > 0) {
                row.add(1); // last element is always 1
            }

            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;

        List<List<Integer>> result = generate(numRows);

        System.out.println(result);
    }
}
