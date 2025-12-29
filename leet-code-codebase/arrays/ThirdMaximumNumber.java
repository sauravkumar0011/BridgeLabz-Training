class ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {
        Long first = null, second = null, third = null;

        for (int num : nums) {
            long val = num;

            if ((first != null && val == first) ||
                (second != null && val == second) ||
                (third != null && val == third)) {
                continue;
            }

            if (first == null || val > first) {
                third = second;
                second = first;
                first = val;
            } else if (second == null || val > second) {
                third = second;
                second = val;
            } else if (third == null || val > third) {
                third = val;
            }
        }

        return third == null ? first.intValue() : third.intValue();
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        System.out.println(thirdMax(nums));
    }
}
