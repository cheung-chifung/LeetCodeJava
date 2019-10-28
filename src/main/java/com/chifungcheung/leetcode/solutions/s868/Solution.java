package com.chifungcheung.leetcode.solutions.s868;

/*
 * @lc app=leetcode id=868 lang=java
 *
 * [868] Binary Gap
 */

// @lc code=start
class Solution {
  public int binaryGap(int N) {
    int last = -1;
    int maxLen = 0;
    for (int i = 31; i >= 0; i--) {
      int n = N & (1 << i);
      if (n > 0) {
        if (last != -1) {
          maxLen = Math.max(maxLen, last - i);
        }
        last = i;
      }
    }
    return maxLen;
  }
}
// @lc code=end
