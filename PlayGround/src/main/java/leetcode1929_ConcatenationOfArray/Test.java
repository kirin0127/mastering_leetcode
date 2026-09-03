package leetcode1929_ConcatenationOfArray;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.testCase1(); test.testCase2(); test.testCase3();
    }

    void testCase1() { test(1, new int[]{1, 2, 1}, new int[]{1, 2, 1, 1, 2, 1}); }
    void testCase2() { test(2, new int[]{1, 3, 2, 1}, new int[]{1, 3, 2, 1, 1, 3, 2, 1}); }
    void testCase3() { test(3, new int[]{1}, new int[]{1, 1}); }

    private void test(int caseNumber, int[] nums, int[] expected) {
        int[] actual = new Solution().getConcatenation(nums);
        if (Arrays.equals(expected, actual)) {
            System.out.println("test case " + caseNumber + " passed");
        } else {
            System.out.println("Test case " + caseNumber + " failed. Expected: "
                    + Arrays.toString(expected) + ", output is: " + Arrays.toString(actual));
        }
    }
}
