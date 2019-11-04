package com.chifungcheung.leetcode.solutions.s338;

/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */

// @lc code=start
class Solution {
  public int[] countBits(int num) {
    int[] ans = new int[num + 1];

    int pd = 0;
    int d = 1;
    for (int i = 1; i < num + 1; i++) {
      if (i == d) {
        pd = d;
        d <<= 1;
      }
      ans[i] = 1 + ans[i - pd];
    }

    return ans;
  }
}
// @lc code=end
