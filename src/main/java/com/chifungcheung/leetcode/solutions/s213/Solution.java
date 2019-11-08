package com.chifungcheung.leetcode.solutions.s213;

/*
 * @lc app=leetcode id=213 lang=java
 *
 * [213] House Robber II
 */

// @lc code=start
class Solution {
  public int rob(int[] nums) {
    int n = nums.length;
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return nums[0];
    }
    if (n == 2) {
      return Integer.max(nums[0], nums[1]);
    }
    int d[][] = new int[2][n]; // rob house 1 and not rob house 1
    d[0][0] = nums[0];
    d[0][1] = nums[0];
    d[1][1] = nums[1];
    for (int i = 2; i < n; i++) {
      // if rob house 1
      if (i == n - 1) {
        d[0][i] = d[0][i - 1];
      } else {
        d[0][i] = Integer.max(nums[i] + d[0][i - 2], d[0][i - 1]);
      }
      // if not rob house 1
      d[1][i] = Integer.max(nums[i] + d[1][i - 2], d[1][i - 1]);
    }
    return Integer.max(d[0][n - 1], d[1][n - 1]);
  }
}
// @lc code=end
