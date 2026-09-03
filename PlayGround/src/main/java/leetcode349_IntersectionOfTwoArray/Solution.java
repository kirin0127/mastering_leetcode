package leetcode349_IntersectionOfTwoArray;

import java.util.*;

/**
 * LeetCode 349 - Intersection of Two Arrays
 * https://leetcode.com/problems/intersection-of-two-arrays/
 *
 * Given two integer arrays, return the distinct values that appear in both
 * arrays. The result may be returned in any order.
 *
 * Examples:
 * 1. nums1 = [1, 2, 2, 1], nums2 = [2, 2] -> [2]
 * 2. nums1 = [4, 9, 5], nums2 = [9, 4, 9, 8, 4] -> [9, 4]
 *    [4, 9] is also valid.
 *
 * Constraints:
 * - 1 <= nums1.length, nums2.length <= 1,000
 * - 0 <= nums1[i], nums2[i] <= 1,000
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums1){
            int count = map.computeIfAbsent(num, k -> 0);
            map.put(num, count + 1);
        }
        Set<Integer> set = new HashSet<>();
        for(int num : nums2){
            Integer count = map.get(num);
            if(count != null){
                set.add(num);
            }
        }
        int[] result = new int[set.size()];
        int i = 0;
        for(int e : set){
            result[i] = e;
            i++;
        }
        return result;
    }
}
