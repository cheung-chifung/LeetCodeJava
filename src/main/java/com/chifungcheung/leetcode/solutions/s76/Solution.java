package com.chifungcheung.leetcode.solutions.s76;

/*
 * @lc app=leetcode id=76 lang=java
 *
 * [76] Minimum Window Substring
 */

// @lc code=start
class Solution {
  public String minWindow(String s, String t) {
    if (s.isEmpty() || t.isEmpty() || s.length() < t.length()) {
      return "";
    }
    int[] m = new int[128];
    for (char ch : t.toCharArray()) {
      m[ch]++;
    }

    int start = 0, end = 0, counter = t.length();
    int minLen = Integer.MAX_VALUE, minStart = 0;
    while (end < s.length()) {
      char chEnd = s.charAt(end);
      if (m[chEnd] > 0) {
        counter--;
      }
      m[chEnd]--;
      end++;
      while (counter == 0) {
        if (end - start < minLen) {
          minLen = end - start;
          minStart = start;
        }
        char chStart = s.charAt(start);
        m[chStart]++;
        if (m[chStart] > 0) {
          counter++;
        }
        start++;
      }
    }
    return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
  }
}
// @lc code=end
