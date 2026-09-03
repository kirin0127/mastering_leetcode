package leetcode219_ContainsDuplicateII;

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
        int k = 3;
        boolean expected = true;

        boolean actual = new Solution().containsNearbyDuplicate(nums, k);
        printResult(1, nums, k, expected, actual);
    }

    void testCase2() {
        int[] nums = new int[]{1, 0, 1, 1};
        int k = 1;
        boolean expected = true;

        boolean actual = new Solution().containsNearbyDuplicate(nums, k);
        printResult(2, nums, k, expected, actual);
    }

    void testCase3() {
        int[] nums = new int[]{1, 2, 3, 1, 2, 3};
        int k = 2;
        boolean expected = false;

        boolean actual = new Solution().containsNearbyDuplicate(nums, k);
        printResult(3, nums, k, expected, actual);
    }

    private void printResult(int caseNumber, int[] nums, int k, boolean expected, boolean actual) {
        if (expected == actual) {
            System.out.println("test case " + caseNumber + " passed");
        } else {
            System.out.println("Test case " + caseNumber + " failed. Input: nums = "
                    + Arrays.toString(nums) + ", k = " + k + ", expected: " + expected
                    + ", output is: " + actual);
        }
    }
}
