package com.chifungcheung.leetcode.solutions.s190;

/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
 */

// @lc code=start
public class Solution {
  // you need treat n as an unsigned value
  public int reverseBits(int n) {
    int ans = 0;
    for (int i = 0; i < 32; i++) {
      if (i == 31) {
        ans += n < 0 ? 1 : 0;
      } else {
        if ((n & (1 << i)) > 0) {
          ans += (1 << (32 - i - 1));
        }
      }
    }
    return ans;
  }
}
// @lc code=end

