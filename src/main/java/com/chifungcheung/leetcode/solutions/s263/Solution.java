package com.chifungcheung.leetcode.solutions.s263;

/*
 * @lc app=leetcode id=263 lang=java
 *
 * [263] Ugly Number
 */

// @lc code=start
class Solution {
  public boolean isUgly(int num) {
    if (num <= 0) {
      return false;
    }
    while (num != 1) {
      if (num % 2 == 0) {
        num /= 2;
      } else if (num % 3 == 0) {
        num /= 3;
      } else if (num % 5 == 0) {
        num /= 5;
      } else {
        break;
      }
    }
    return num == 1;
  }
}
// @lc code=end
