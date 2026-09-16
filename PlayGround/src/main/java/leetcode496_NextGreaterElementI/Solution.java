package leetcode496_NextGreaterElementI;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * LeetCode 496 - Next Greater Element I (Easy)
 * https://leetcode.com/problems/next-greater-element-i/
 *
 * For each value in nums1, locate it in nums2 and find the first strictly
 * larger value to its right in nums2. Use -1 if none exists.
 * Return answers in nums1 order, not sorted order.
 *
 * Official examples:
 * 1. nums1 = [4, 1, 2], nums2 = [1, 3, 4, 2] -> [-1, 3, -1]
 * 2. nums1 = [2, 4], nums2 = [1, 2, 3, 4] -> [3, -1]
 *
 * Constraints:
 * - 1 <= nums1.length <= nums2.length <= 1000.
 * - 0 <= nums1[i], nums2[i] <= 10000.
 * - Each array contains distinct values.
 * - Every value in nums1 occurs in nums2.
 *
 * Follow-up: achieve O(nums1.length + nums2.length) time.
 * Submit this class without its package declaration; do not submit Test.java.
 */
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Stack<Integer> mono = new Stack<>();
        for(int num : nums2){
            if(mono.empty() || num > mono.peek()){
                mono.push(num);
            }
        }
        
        return ans;
    }
}

class Solution_bruteForce {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int targetIdx = 0;
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    targetIdx = j;
                    break;
                }
            }
            int firstGreater = -1;
            for(int k = targetIdx + 1; k < nums2.length; k++){
                if(nums2[k] > nums1[i]){
                    firstGreater = nums2[k];
                    break;
                }
            }
            ans[i] = firstGreater;
        }
        return ans;
    }
}
