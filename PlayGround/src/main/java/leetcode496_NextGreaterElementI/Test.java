package leetcode496_NextGreaterElementI;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.testCase1();
        test.testCase2();
    }

    void testCase1() {
        check(1, new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}, new int[]{-1, 3, -1});
    }

    void testCase2() {
        check(2, new int[]{2, 4}, new int[]{1, 2, 3, 4}, new int[]{3, -1});
    }

    private void check(int example, int[] nums1, int[] nums2, int[] expected) {
        try {
            int[] actual = new Solution().nextGreaterElement(nums1, nums2);
            // Order is significant; Arrays.equals also handles a null actual result.
            System.out.println("Example " + example
                    + (Arrays.equals(expected, actual) ? " passed" : " failed")
                    + ". Expected: " + Arrays.toString(expected)
                    + ", actual: " + Arrays.toString(actual));
        } catch (UnsupportedOperationException e) {
            System.out.println("Example " + example
                    + ("Not implemented yet".equals(e.getMessage()) ? " unfinished: " : " error: ") + e);
        } catch (Exception e) {
            System.out.println("Example " + example + " error: " + e);
            e.printStackTrace(System.out);
        }
    }
}
