package leetcode217_ContainsDuplicate;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.testCase1();
        test.testCase2();
        test.testCase3();
    }

    void testCase1() {
        int[] nums = new int[]{1, 2, 3, 1};
        boolean expected = true;

        boolean actual = new Solution().containsDuplicate(nums);
        printResult(1, nums, expected, actual);
    }

    void testCase2() {
        int[] nums = new int[]{1, 2, 3, 4};
        boolean expected = false;

        boolean actual = new Solution().containsDuplicate(nums);
        printResult(2, nums, expected, actual);
    }

    void testCase3() {
        int[] nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean expected = true;

        boolean actual = new Solution().containsDuplicate(nums);
        printResult(3, nums, expected, actual);
    }

    private void printResult(int caseNumber, int[] nums, boolean expected, boolean actual) {
        if (expected == actual) {
            System.out.println("test case " + caseNumber + " passed");
        } else {
            System.out.println("Test case " + caseNumber + " failed. Input: "
                    + Arrays.toString(nums) + ", expected: " + expected
                    + ", output is: " + actual);
        }
    }
}
