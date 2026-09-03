package leetcode1_TwoSum;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * LeetCode 1 - Two Sum
 * https://leetcode.com/problems/two-sum/
 *
 * Return the indices of two different elements whose sum equals target.
 * Exactly one valid answer exists.
 *
 * Examples:
 * 1. nums = [2, 7, 11, 15], target = 9 -> [0, 1]
 * 2. nums = [3, 2, 4], target = 6 -> [1, 2]
 * 3. nums = [3, 3], target = 6 -> [0, 1]
 *
 * Constraints:
 * - 2 <= nums.length <= 10,000
 * - -1,000,000,000 <= nums[i], target <= 1,000,000,000
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            Integer j = map.get(target - nums[i]);
            if(j != null && i != j){
                return new int[]{i, j};
            }
        }
        return null;
    }
}
