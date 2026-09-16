package leetcode20_ValidParentheses;

import java.util.Stack;

/**
 * LeetCode 20 - Valid Parentheses (Easy)
 * https://leetcode.com/problems/valid-parentheses/
 *
 * Decide whether all brackets in s form correctly nested matching pairs.
 * A closing bracket must match the most recent unmatched opening bracket,
 * and no bracket may remain unmatched.
 *
 * Official examples:
 * 1. s = "()"     -> true
 * 2. s = "()[]{}" -> true
 * 3. s = "(]"     -> false
 * 4. s = "([])"   -> true
 * 5. s = "([)]"   -> false
 *
 * Constraints:
 * - 1 <= s.length <= 10000.
 * - Only the characters '(', ')', '[', ']', '{', '}' occur.
 *
 * Submit this class without its package declaration; do not submit Test.java.
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else if(ch == ')' && (stack.empty() || stack.pop() != '(')){
                return false;
            }else if(ch == ']' && (stack.empty() || stack.pop() != '[')){
                return false;
            }else if(ch == '}' && (stack.empty() || stack.pop() != '{')){
                return false;
            }
        }
        return stack.empty();
    }
}
