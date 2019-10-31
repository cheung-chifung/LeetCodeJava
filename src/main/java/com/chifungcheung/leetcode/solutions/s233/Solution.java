package com.chifungcheung.leetcode.solutions.s233;

/*
 * @lc app=leetcode id=233 lang=java
 *
 * [233] Number of Digit One
 */

// @lc code=start
class Solution {
  public int countDigitOne(int n) {
    if (n == 0) {
      return 0;
    } else if (n > 0 && n <= 9) {
      return 1;
    }
    int num = n;
    int divider = 1;
    while (num / 10 > 0) {
      num /= 10;
      divider *= 10;
    }
    int f1 = 0;
    if (num == 1) {
      f1 = n % divider + 1;
    } else if (num > 1) {
      f1 = divider;
    }
    int f2 = num * countDigitOne(divider - 1);
    return f1 + f2 + countDigitOne(n % divider);
  }
}
// @lc code=end
