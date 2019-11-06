package com.chifungcheung.leetcode.solutions.s409;

/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
  public int longestPalindrome(String s) {
    int n = s.length();
    if (n <= 1) {
      return n;
    }
    int ans = 0;
    Map<Character, Integer> m = new HashMap<>();
    for (char ch : s.toCharArray()) {
      int c = m.getOrDefault(ch, 0);
      m.put(ch, ++c);
    }
    boolean rest = false;
    for (Entry<Character, Integer> entry : m.entrySet()) {
      int c = entry.getValue();
      if (c >= 2) {
        ans += c - (c % 2);
      }
      if (c > 0 && c % 2 == 1) {
        rest = true;
      }
    }
    if (rest) {
      return ans + 1;
    }
    return ans;
  }
}
// @lc code=end
