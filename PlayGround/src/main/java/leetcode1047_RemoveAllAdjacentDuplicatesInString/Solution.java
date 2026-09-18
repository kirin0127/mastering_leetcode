package leetcode1047_RemoveAllAdjacentDuplicatesInString;

import java.util.Stack;

/**
 * LeetCode 1047 - Remove All Adjacent Duplicates In String (Easy)
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 *
 * Repeatedly delete a pair of neighboring equal letters until no such pair
 * remains. Return the resulting string; the final result is unique.
 * A deletion can bring another matching pair together.
 *
 * Official examples:
 * 1. s = "abbaca" -> "ca" (remove "bb", then the newly adjacent "aa").
 * 2. s = "azxxzy" -> "ay".
 *
 * Constraints:
 * - 1 <= s.length <= 100000.
 * - s contains lowercase English letters only.
 *
 * Submit this file without its package declaration; do not submit Test.java.
 */
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stack.empty() && stack.peek() == ch){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.empty()){
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}
