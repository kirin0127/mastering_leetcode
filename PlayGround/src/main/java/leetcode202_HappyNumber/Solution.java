package leetcode202_HappyNumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * LeetCode 202 - Happy Number
 * https://leetcode.com/problems/happy-number/
 *
 * Repeatedly replace a positive integer with the sum of the squared digits.
 * A number is happy when this process reaches 1; it is not happy when the
 * process repeats in a cycle that never reaches 1.
 *
 * Examples:
 * 1. n = 19 -> true
 * 2. n = 2 -> false
 *
 * Constraints:
 * - 1 <= n <= 2^31 - 1
 */
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        seen.add(n);
        while(n != 1){
            List<Integer> digits = new ArrayList<>();
            while(n != 0){
                int digit = n % 10;
                digits.add(digit);
                n = n / 10;
            }
            for(int digit : digits){
                n += digit * digit;
            }
            if(seen.contains(n)){
                return false;
            }
            seen.add(n);
        }
        return true;
    }
}
