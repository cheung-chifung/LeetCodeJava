package com.chifungcheung.leetcode.solutions.s81;

/*
 * @lc app=leetcode id=81 lang=java
 *
 * [81] Search in Rotated Sorted Array II
 */

// @lc code=start
class Solution {
  public boolean search(int[] nums, int target) {
    if (nums.length <= 3) {
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == target) {
          return true;
        }
      }
      return false;
    }

    int l = 0;
    int r = nums.length - 1;
    while (l < r) {
      int m = l + (r - l) / 2;
      if (nums[m] > nums[r]) {
        if (nums[m] < target || target <= nums[r]) {
          l = m + 1;
        } else {
          r = m;
        }
      } else if (nums[m] < nums[r]) {
        if (nums[m] < target && target <= nums[r]) {
          l = m + 1;
        } else {
          r = m;
        }
      } else {
        r--;
      }
    }
    return (nums[l] == target);
  }
}
// @lc code=end
