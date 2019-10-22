package com.chifungcheung.leetcode.solutions.s231;

/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
class Solution {
  public boolean isPowerOfTwo(int n) {
    while (n > 0) {
      if (n < 1) {
        return false;
      }
      if (n == 1) {
        return true;
      }
      if ((n & 1) == 1) {
        return false;
      }
      n = n >> 1;
    }
    return false;
  }
}
// @lc code=end
