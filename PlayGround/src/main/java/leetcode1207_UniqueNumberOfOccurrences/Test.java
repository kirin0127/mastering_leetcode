package leetcode1207_UniqueNumberOfOccurrences;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.testCase1();
        test.testCase2();
        test.testCase3();
    }

    void testCase1() {
        int[] arr = new int[]{1, 2, 2, 1, 1, 3};
        boolean expected = true;

        boolean actual = new Solution().uniqueOccurrences(arr);
        printResult(1, arr, expected, actual);
    }

    void testCase2() {
        int[] arr = new int[]{1, 2};
        boolean expected = false;

        boolean actual = new Solution().uniqueOccurrences(arr);
        printResult(2, arr, expected, actual);
    }

    void testCase3() {
        int[] arr = new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        boolean expected = true;

        boolean actual = new Solution().uniqueOccurrences(arr);
        printResult(3, arr, expected, actual);
    }

    private void printResult(int caseNumber, int[] arr, boolean expected, boolean actual) {
        if (expected == actual) {
            System.out.println("test case " + caseNumber + " passed");
        } else {
            System.out.println("Test case " + caseNumber + " failed. Input: "
                    + Arrays.toString(arr) + ", expected: " + expected
                    + ", output is: " + actual);
        }
    }
}
