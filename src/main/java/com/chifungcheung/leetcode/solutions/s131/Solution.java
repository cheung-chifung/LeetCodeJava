package com.chifungcheung.leetcode.solutions.s131;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode id=131 lang=java
 *
 * [131] Palindrome Partitioning
 */

// @lc code=start
class Solution {
  public List<List<String>> partition(String s) {
    List<List<String>> ans = new ArrayList<>();
    backtrack(ans, new Stack<>(), s, 0);
    return ans;
  }

  private void backtrack(List<List<String>> ans, Stack<String> stack, String s, int start) {
    if (start == s.length()) {
      ans.add(new ArrayList<>(stack));
    } else {
      for (int i = start; i < s.length(); i++) {
        if (isPalindrome(s, start, i)) {
          stack.push(s.substring(start, i + 1));
          backtrack(ans, stack, s, i + 1);
          stack.pop();
        }
      }
    }
  }

  private boolean isPalindrome(String s, int left, int right) {
    while (left < right) {
      if (s.charAt(left++) != s.charAt(right--)) {
        return false;
      }
    }
    return true;
  }
}
// @lc code=end
