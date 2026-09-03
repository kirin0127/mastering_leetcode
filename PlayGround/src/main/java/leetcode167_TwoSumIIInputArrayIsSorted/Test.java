package leetcode167_TwoSumIIInputArrayIsSorted;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.testCase1(); test.testCase2(); test.testCase3(); test.testCase4();
    }

    void testCase1() { test(1, new int[]{2, 7, 11, 15}, 9, new int[]{1, 2}); }
    void testCase2() { test(2, new int[]{2, 3, 4}, 6, new int[]{1, 3}); }
    void testCase3() { test(3, new int[]{-1, 0}, -1, new int[]{1, 2}); }
    void testCase4() { test(4, new int[]{5, 25, 75}, 100, new int[]{2, 3}); }

    private void test(int caseNumber, int[] numbers, int target, int[] expected) {
        int[] actual = new Solution().twoSum(numbers, target);
        if (Arrays.equals(expected, actual)) {
            System.out.println("test case " + caseNumber + " passed");
        } else {
            System.out.println("Test case " + caseNumber + " failed. Expected: "
                    + Arrays.toString(expected) + ", output is: " + Arrays.toString(actual));
        }
    }
}
