package leetcode1047_RemoveAllAdjacentDuplicatesInString;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.testCase1();
        test.testCase2();
    }

    void testCase1() {
        check(1, "abbaca", "ca");
    }

    void testCase2() {
        check(2, "azxxzy", "ay");
    }

    private void check(int example, String input, String expected) {
        try {
            String actual = new Solution().removeDuplicates(input);
            System.out.println("Example " + example
                    + (expected.equals(actual) ? " passed" : " failed")
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
