package com.chifungcheung.leetcode.solutions.s357;

/*
 * @lc app=leetcode id=357 lang=java
 *
 * [357] Count Numbers with Unique Digits
 */

// @lc code=start
class Solution {
  public int countNumbersWithUniqueDigits(int n) {
    if (n == 0) {
      return 1;
    }

    return 9 * comb(n - 1) + countNumbersWithUniqueDigits(n - 1);
  }

  private int comb(int n) {
    int d = 9;
    int ans = 1;
    while (n > 0) {
      ans *= d;
      d--;
      n--;
    }
    return ans;
  }
}
// @lc code=end
