package com.chifungcheung.leetcode.solutions.s367;

/*
 * @lc app=leetcode id=367 lang=java
 *
 * [367] Valid Perfect Square
 */

// @lc code=start
class Solution {
  public boolean isPerfectSquare(int num) {
    if (num < 0) {
      return false;
    } else if (num <= 1) {
      return true;
    }
    long l = 1;
    long r = num;
    while (l < r) {
      long mid = l + (r - l) / 2;
      long sq = mid * mid;
      if (sq == num) {
        return true;
      }
      if (sq < num) {
        l = mid + 1;
      } else {
        r = mid;
      }
    }
    return l * l == num;
  }
}
// @lc code=end
