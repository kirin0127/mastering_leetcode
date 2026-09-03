package leetcode217_ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 217 - Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 *
 * Return true when an integer array contains a value at least twice; return
 * false when every value is distinct.
 *
 * Examples:
 * 1. nums = [1, 2, 3, 1] -> true
 * 2. nums = [1, 2, 3, 4] -> false
 * 3. nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2] -> true
 *
 * Constraints:
 * - 1 <= nums.length <= 100,000
 * - -1,000,000,000 <= nums[i] <= 1,000,000,000
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        return set.size() != nums.length;
    }
}
