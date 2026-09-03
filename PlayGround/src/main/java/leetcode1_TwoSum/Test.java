package leetcode1_TwoSum;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.testCase1(); test.testCase2(); test.testCase3();
    }

    void testCase1() { test(1, new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}); }
    void testCase2() { test(2, new int[]{3, 2, 4}, 6, new int[]{1, 2}); }
    void testCase3() { test(3, new int[]{3, 3}, 6, new int[]{0, 1}); }

    private void test(int caseNumber, int[] nums, int target, int[] expected) {
        int[] actual = new Solution().twoSum(nums, target);
        if (actual != null && actual.length == expected.length) {
            int[] sortedActual = Arrays.copyOf(actual, actual.length);
            Arrays.sort(sortedActual);
            if (Arrays.equals(expected, sortedActual)) {
                System.out.println("test case " + caseNumber + " passed");
                return;
            }
        }
        System.out.println("Test case " + caseNumber + " failed. Expected: "
                + Arrays.toString(expected) + ", output is: " + Arrays.toString(actual));
    }
}
