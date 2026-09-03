package leetcode349_IntersectionOfTwoArray;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.testCase1();
        test.testCase2();
    }

    void testCase1() {
        int[] num1 = new int[]{1, 2, 2, 1};
        int[] num2 = new int[]{2, 2};
        int[] answer = new int[]{2};
        Solution sol = new Solution();
        int[] result = sol.intersection(num1, num2);
        boolean pass = false;
        Set<Integer> set1 = Arrays.stream(answer).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(result).boxed().collect(Collectors.toSet());
        if (Arrays.equals(answer, result)) {
            pass = true;
        } else if (answer.length == result.length) {
            pass = (set1.size() == set2.size()) && set1.containsAll(set2);
        }
        if (!pass) {
            System.out.println("Expected: " + set1 + ", output is: " + set2);
        } else {
            System.out.println("test case 1 passed");
        }
    }

    void testCase2() {
        int[] num1 = new int[]{4, 9, 5};
        int[] num2 = new int[]{9, 4, 9, 8, 4};
        int[] answer = new int[]{9, 4};
        Solution sol = new Solution();
        int[] result = sol.intersection(num1, num2);
        boolean pass = false;
        Set<Integer> set1 = Arrays.stream(answer).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(result).boxed().collect(Collectors.toSet());
        if (Arrays.equals(answer, result)) {
            pass = true;
        } else if (answer.length == result.length) {
            pass = (set1.size() == set2.size()) && set1.containsAll(set2);
        }
        if (!pass) {
            System.out.println("Expected: " + set1 + ", output is: " + set2);
        } else {
            System.out.println("test case 2 passed");
        }
    }
}
