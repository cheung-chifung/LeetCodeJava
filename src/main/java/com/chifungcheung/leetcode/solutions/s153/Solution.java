package com.chifungcheung.leetcode.solutions.s153;

/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
  public int findMin(int[] nums) {
    if (nums.length == 0) {
      return -1;
    }
    if (nums.length == 1) {
      return nums[0];
    }
    int l = 0, r = nums.length - 1;
    while (l < r) {
      int m = l + (r - l) / 2 + 1;
      if (nums[l] < nums[m]) {
        if (nums[l] < nums[r]) {
          return nums[l];
        } else {
          l = m;
        }
      } else {
        if (nums[m - 1] > nums[m]) {
          return nums[m];
        } else {
          r = m - 1;
        }
      }
    }
    return nums[l];
  }
}
// @lc code=end

