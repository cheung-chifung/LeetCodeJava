package com.chifungcheung.leetcode.solutions.s201;

/*
 * @lc app=leetcode id=201 lang=java
 *
 * [201] Bitwise AND of Numbers Range
 */

// @lc code=start
class Solution {
  public int rangeBitwiseAnd(int m, int n) {
    int ans = 0;
    for (int i = 30; i >= 0; i--) {
      int d = 1 << i;
      if ((m & d) == (n & d)) {
        ans |= (m & d);
      } else {
        break;
      }
    }
    return ans;
  }
}
// @lc code=end
