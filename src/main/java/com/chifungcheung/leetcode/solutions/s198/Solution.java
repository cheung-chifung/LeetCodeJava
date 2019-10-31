package com.chifungcheung.leetcode.solutions.s198;

/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution {
  public int rob(int[] nums) {
    int n = nums.length;
    int[] d = new int[n + 2];
    d[0] = 0;
    d[1] = 0;
    for (int i = 2; i < n + 2; i++) {
      d[i] = Math.max(d[i - 2] + nums[i - 2], d[i - 1]);
    }
    return d[n + 1];
  }
}
// @lc code=end
