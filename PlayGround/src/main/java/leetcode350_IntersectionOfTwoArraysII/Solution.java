package leetcode350_IntersectionOfTwoArraysII;

import java.util.*;

/**
 * LeetCode 350 - Intersection of Two Arrays II
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 *
 * Given two integer arrays, return their intersection. A value must occur in
 * the result as many times as it occurs in both arrays. The result may be in
 * any order.
 *
 * Examples:
 * 1. nums1 = [1, 2, 2, 1], nums2 = [2, 2] -> [2, 2]
 * 2. nums1 = [4, 9, 5], nums2 = [9, 4, 9, 8, 4] -> [4, 9]
 *    [9, 4] is also valid.
 *
 * Constraints:
 * - 1 <= nums1.length, nums2.length <= 1,000
 * - 0 <= nums1[i], nums2[i] <= 1,000
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums1){
            int count = map.computeIfAbsent(num, k -> 0);
            map.put(num, count + 1);
        }
        List<Integer> list = new ArrayList<>();
        for(int num : nums2){
            Integer count = map.get(num);
            if(count != null && count > 0){
                list.add(num);
                map.put(num, count - 1);
            }
        }
        int[] result = new int[list.size()];
        int i = 0;
        for(int e : list){
            result[i] = e;
            i++;
        }
        return result;
    }
}
