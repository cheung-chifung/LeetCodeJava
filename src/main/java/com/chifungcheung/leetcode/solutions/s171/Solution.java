package com.chifungcheung.leetcode.solutions.s171;

/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 */

// @lc code=start
class Solution {
  public int titleToNumber(String s) {
    int ans = 0;
    int scalar = 1;
    for (int i = s.length() - 1; i >= 0; i--) {
      char ch = s.charAt(i);
      if (ch >= 'A' && ch <= 'Z') {
        int ascii = ch - 'A' + 1;
        ans += ascii * scalar;

        scalar *= 26;
      }
    }
    return ans;
  }
}
// @lc code=end
