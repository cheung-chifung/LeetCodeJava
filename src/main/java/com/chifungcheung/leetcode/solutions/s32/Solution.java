package com.chifungcheung.leetcode.solutions.s32;

import java.util.Stack;

/*
 * @lc app=leetcode id=32 lang=java
 *
 * [32] Longest Valid Parentheses
 */

// @lc code=start
class Solution {
  public int longestValidParentheses(String s) {
    Stack<Integer> stack = new Stack<>();
    int start = -1;
    int ans = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        stack.push(i);
      } else if (s.charAt(i) == ')') {
        if (stack.empty()) {
          start = i;
        } else {
          stack.pop();
          if (stack.empty()) {
            ans = Math.max(ans, i - start);
          } else {
            ans = Math.max(ans, i - stack.peek());
          }
        }
      }
    }

    return ans;
  }
}
// @lc code=end
