package com.chifungcheung.leetcode.solutions.s300;

/*
 * @lc app=leetcode id=300 lang=java
 *
 * [300] Longest Increasing Subsequence
 */

// @lc code=start
class Solution {
  public int lengthOfLIS(int[] nums) {
    int n = nums.length;
    if (n <= 1) {
      return n;
    }
    int[] d = new int[n];
    for (int i = 0; i < n; i++) {
      d[i] = 1;
    }
    for (int k = 1; k < n; k++) {
      for (int i = 0; i < k; i++) {
        if (nums[k] > nums[i]) {
          d[k] = Integer.max(d[k], d[i] + 1);
        }
      }
    }

    int max = 0;
    for (int i = 0; i < n; i++) {
      max = Integer.max(max, d[i]);
    }

    return max;
  }
}
// @lc code=end
