package leetcode225_ImplementStackUsingQueues;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        new Test().testCase1();
    }

    void testCase1() {
        Object[] expected = {null, null, null, 2, 2, false};
        Object[] actual = new Object[6];
        try {
            MyStack stack = new MyStack();
            stack.push(1);
            stack.push(2);
            actual[3] = stack.top();
            actual[4] = stack.pop();
            actual[5] = stack.empty();
            // Constructor and void push operations have null results on LeetCode.
            System.out.println("Example 1 " + (Arrays.equals(expected, actual) ? "passed" : "failed")
                    + ". Expected: " + Arrays.toString(expected)
                    + ", actual: " + Arrays.toString(actual));
        } catch (UnsupportedOperationException e) {
            System.out.println("Example 1 "
                    + ("Not implemented yet".equals(e.getMessage()) ? "unfinished: " : "error: ") + e);
        } catch (Exception e) {
            System.out.println("Example 1 error: " + e);
            e.printStackTrace(System.out);
        }
    }
}
