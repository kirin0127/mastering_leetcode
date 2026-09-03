package leetcode219_ContainsDuplicateII;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * LeetCode 219 - Contains Duplicate II
 * https://leetcode.com/problems/contains-duplicate-ii/
 *
 * Return true when equal values occur at two different indices whose distance
 * is at most k. Return false when no such pair exists.
 *
 * Examples:
 * 1. nums = [1, 2, 3, 1], k = 3 -> true
 * 2. nums = [1, 0, 1, 1], k = 1 -> true
 * 3. nums = [1, 2, 3, 1, 2, 3], k = 2 -> false
 *
 * Constraints:
 * - 1 <= nums.length <= 100,000
 * - -1,000,000,000 <= nums[i] <= 1,000,000,000
 * - 0 <= k <= 100,000
 */
class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        return this.containsNearbyDuplicateByMap(nums, k);
        return this.containsNearbyDuplicateBySet(nums, k);
    }

    public boolean containsNearbyDuplicateByMap(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            Integer prevIdx = map.get(nums[i]);
            if(prevIdx == null){
                map.put(nums[i], i);
            }else{
                int dist = i - prevIdx;
                if(dist <= k){
                    return true;
                }
                map.put(nums[i], i);
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicateBySet(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(i > k){
                set.remove(nums[i - k - 1]);
            }
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
