package com.chifungcheung.leetcode.solutions.s214;

/*
 * @lc app=leetcode id=214 lang=java
 *
 * [214] Shortest Palindrome
 */

// @lc code=start
class Solution {
  public String shortestPalindrome(String s) {
    if (s.length() <= 1) {
      return s;
    }
    String newStr = s + "#" + new StringBuilder(s).reverse().toString();
    int[] position = new int[newStr.length()];

    for (int i = 1; i < position.length; i++) {
      int prevPos = position[i - 1];
      while (prevPos > 0 && newStr.charAt(prevPos) != newStr.charAt(i))
        prevPos = position[prevPos - 1];
      position[i] = prevPos + ((newStr.charAt(prevPos) == newStr.charAt(i)) ? 1 : 0);
    }

    return new StringBuilder(s.substring(position[position.length - 1])).reverse().toString() + s;
  }
}
// @lc code=end
