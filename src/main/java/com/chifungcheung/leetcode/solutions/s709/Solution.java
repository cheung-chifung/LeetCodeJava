package com.chifungcheung.leetcode.solutions.s709;

/*
 * @lc app=leetcode id=709 lang=java
 *
 * [709] To Lower Case
 */

// @lc code=start
class Solution {
  public String toLowerCase(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c >= 'A' && c <= 'Z') {
        sb.append(Character.toLowerCase(c));
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }
}
// @lc code=end
