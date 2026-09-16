package leetcode20_ValidParentheses;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.testCase1();
        test.testCase2();
        test.testCase3();
        test.testCase4();
        test.testCase5();
    }

    void testCase1() { check(1, "()", true); }
    void testCase2() { check(2, "()[]{}", true); }
    void testCase3() { check(3, "(]", false); }
    void testCase4() { check(4, "([])", true); }
    void testCase5() { check(5, "([)]", false); }

    private void check(int example, String input, boolean expected) {
        try {
            boolean actual = new Solution().isValid(input);
            System.out.println("Example " + example + (actual == expected ? " passed" : " failed")
                    + ". Input: " + input + ", expected: " + expected + ", actual: " + actual);
        } catch (UnsupportedOperationException e) {
            System.out.println("Example " + example
                    + ("Not implemented yet".equals(e.getMessage()) ? " unfinished: " : " error: ") + e);
        } catch (Exception e) {
            System.out.println("Example " + example + " error: " + e);
            e.printStackTrace(System.out);
        }
    }
}
