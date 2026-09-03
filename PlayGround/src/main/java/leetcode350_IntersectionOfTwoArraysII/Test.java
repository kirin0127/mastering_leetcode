package leetcode350_IntersectionOfTwoArraysII;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.testCase1();
        test.testCase2();
    }

    void testCase1() {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        int[] expected = new int[]{2, 2};

        int[] actual = new Solution().intersect(nums1, nums2);
        printResult(1, expected, actual);
    }

    void testCase2() {
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};
        int[] expected = new int[]{4, 9};

        int[] actual = new Solution().intersect(nums1, nums2);
        printResult(2, expected, actual);
    }

    private void printResult(int caseNumber, int[] expected, int[] actual) {
        if (actual == null) {
            System.out.println("Test case " + caseNumber + " failed. Expected: "
                    + Arrays.toString(expected) + ", output is: null");
            return;
        }

        int[] sortedExpected = Arrays.copyOf(expected, expected.length);
        int[] sortedActual = Arrays.copyOf(actual, actual.length);
        Arrays.sort(sortedExpected);
        Arrays.sort(sortedActual);

        if (Arrays.equals(sortedExpected, sortedActual)) {
            System.out.println("test case " + caseNumber + " passed");
        } else {
            System.out.println("Test case " + caseNumber + " failed. Expected: "
                    + Arrays.toString(expected) + ", output is: "
                    + Arrays.toString(actual));
        }
    }
}
