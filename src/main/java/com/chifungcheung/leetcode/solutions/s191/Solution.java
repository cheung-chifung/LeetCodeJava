package com.chifungcheung.leetcode.solutions.s191;

/*
 * @lc app=leetcode id=191 lang=java
 *
 * [191] Number of 1 Bits
 */

// @lc code=start
public class Solution {
  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    int ans = 0;
    boolean comp = n < 0;
    if (comp) {
      n = -1 - n;
    }
    while (n > 0) {
      if ((n & 1) == 1) {
        ans++;
      }
      n >>= 1;
    }
    if (comp) {
      ans = 32 - ans;
    }
    return ans;
  }
}
// @lc code=end
