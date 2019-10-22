package com.chifungcheung.leetcode.solutions.s45;

/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */

// @lc code=start
class Solution {
  public int jump(int[] nums) {
    int n = nums.length;
    if (n <= 1) {
      return 0;
    }

    int[] d = new int[n];
    d[n - 1] = 0;

    for (int i = n - 2; i >= 0; i--) {
      int minStep = Integer.MAX_VALUE;
      int jump = 1;
      while (jump <= nums[i] && i + jump < n) {
        minStep = Math.min(d[i + jump], minStep);
        jump++;
      }
      if (minStep != Integer.MAX_VALUE) {
        d[i] = minStep + 1;
      } else {
        d[i] = Integer.MAX_VALUE;
      }
    }
    return d[0];
  }
}
// @lc code=end
