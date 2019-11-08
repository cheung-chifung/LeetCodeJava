package com.chifungcheung.leetcode.solutions.s209;

/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */

// @lc code=start
class Solution {
  public int minSubArrayLen(int s, int[] nums) {
    int left = 0, right = 0;
    int min = Integer.MAX_VALUE;
    int acc = 0;
    while (left <= right && right < nums.length) {
      acc += nums[right];
      while (acc >= s && left <= right) {
        min = Integer.min(min, right - left + 1);
        acc -= nums[left];
        left++;
      }
      right++;
    }

    return min == Integer.MAX_VALUE ? 0 : min;
  }
}
// @lc code=end
