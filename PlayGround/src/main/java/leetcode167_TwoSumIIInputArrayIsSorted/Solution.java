package leetcode167_TwoSumIIInputArrayIsSorted;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 167 - Two Sum II - Input Array Is Sorted
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 *
 * Given an ascending integer array, return the one-based indices of the two
 * values whose sum equals target. Exactly one answer exists.
 *
 * Examples:
 * 1. numbers = [2, 7, 11, 15], target = 9 -> [1, 2]
 * 2. numbers = [2, 3, 4], target = 6 -> [1, 3]
 * 3. numbers = [-1, 0], target = -1 -> [1, 2]
 *
 * Constraints:
 * - 2 <= numbers.length <= 30,000
 * - -1,000 <= numbers[i], target <= 1,000
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int slow = 0;
        int fast = numbers.length - 1;
        int sum = numbers[slow] + numbers[fast];
        while(sum != target){
            if(sum < target){
                slow++;
            }else{
                fast--;
            }
            sum = numbers[slow] + numbers[fast];
        }
        return new int[]{slow + 1, fast + 1};
    }
}
