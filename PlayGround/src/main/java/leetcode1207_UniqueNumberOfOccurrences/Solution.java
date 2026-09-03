package leetcode1207_UniqueNumberOfOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * LeetCode 1207 - Unique Number of Occurrences
 * https://leetcode.com/problems/unique-number-of-occurrences/
 *
 * Given an integer array, return whether every distinct value appears a
 * different number of times.
 *
 * Examples:
 * 1. arr = [1, 2, 2, 1, 1, 3] -> true
 *    The values occur 3, 2, and 1 times respectively.
 * 2. arr = [1, 2] -> false
 * 3. arr = [-3, 0, 1, -3, 1, 1, 1, -3, 10, 0] -> true
 *
 * Constraints:
 * - 1 <= arr.length <= 1,000
 * - -1,000 <= arr[i] <= 1,000
 */
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            int count = map.computeIfAbsent(num, k -> 0);
            map.put(num, count + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }
}
