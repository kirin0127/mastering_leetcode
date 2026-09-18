package leetcode144_BinaryTreePreorderTraversal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.testCase1();
        test.testCase2();
        test.testCase3();
        test.testCase4();
    }

    void testCase1() {
        // Level-order input: [1,null,2,3].
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        check(1, root, Arrays.asList(1, 2, 3));
    }

    void testCase2() {
        // Level-order input: [1,2,3,4,5,null,8,null,null,6,7,9].
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4),
                        new TreeNode(5, new TreeNode(6), new TreeNode(7))),
                new TreeNode(3, null, new TreeNode(8, new TreeNode(9), null)));
        check(2, root, Arrays.asList(1, 2, 4, 5, 6, 7, 3, 8, 9));
    }

    void testCase3() {
        check(3, null, Collections.<Integer>emptyList());
    }

    void testCase4() {
        check(4, new TreeNode(1), Collections.singletonList(1));
    }

    private void check(int example, TreeNode root, List<Integer> expected) {
        try {
            List<Integer> actual = new Solution().preorderTraversal(root);
            // List.equals preserves traversal order and safely rejects null.
            System.out.println("Example " + example
                    + (expected.equals(actual) ? " passed" : " failed")
                    + ". Expected: " + expected + ", actual: " + actual);
        } catch (UnsupportedOperationException e) {
            System.out.println("Example " + example
                    + ("Not implemented yet".equals(e.getMessage()) ? " unfinished: " : " error: ") + e);
        } catch (Exception e) {
            System.out.println("Example " + example + " error: " + e);
            e.printStackTrace(System.out);
        }
    }
}
