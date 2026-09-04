package leetcode1929_ConcatenationOfArray;

/**
 * LeetCode 1929 - Concatenation of Array
 * https://leetcode.com/problems/concatenation-of-array/
 *
 * Return an array that contains nums followed immediately by nums again.
 *
 * Examples:
 * 1. nums = [1, 2, 1] -> [1, 2, 1, 1, 2, 1]
 * 2. nums = [1, 3, 2, 1] -> [1, 3, 2, 1, 1, 3, 2, 1]
 * 3. nums = [1] -> [1, 1]
 *
 * Constraints:
 * - 1 <= nums.length <= 1,000
 * - -1,000 <= nums[i] <= 1,000
 */
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] con = new int[nums.length * 2];
        for(int i = 0; i < nums.length * 2; i++){
            if(i < nums.length){
                con[i] = nums[i];
            }else{
                int j = i - nums.length;
                con[i] = nums[j];
            }
        }
        return con;
    }
}
