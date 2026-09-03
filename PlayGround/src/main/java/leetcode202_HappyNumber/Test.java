package leetcode202_HappyNumber;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.testCase1();
        test.testCase2();
    }

    void testCase1() {
        int n = 19;
        boolean expected = true;

        boolean actual = new Solution().isHappy(n);
        printResult(1, n, expected, actual);
    }

    void testCase2() {
        int n = 2;
        boolean expected = false;

        boolean actual = new Solution().isHappy(n);
        printResult(2, n, expected, actual);
    }

    private void printResult(int caseNumber, int n, boolean expected, boolean actual) {
        if (expected == actual) {
            System.out.println("test case " + caseNumber + " passed");
        } else {
            System.out.println("Test case " + caseNumber + " failed. Input: n = " + n
                    + ", expected: " + expected + ", output is: " + actual);
        }
    }
}
