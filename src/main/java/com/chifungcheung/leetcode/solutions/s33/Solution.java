package com.chifungcheung.leetcode.solutions.s33;

/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
  public int search(int[] nums, int target) {
    if (nums.length <= 3) {
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == target) {
          return i;
        }
      }
      return -1;
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
      } else {
        if (nums[m] < target && target <= nums[r]) {
          l = m + 1;
        } else {
          r = m;
        }
      }
    }
    if (nums[l] == target) {
      return l;
    }
    return -1;
  }
}
// @lc code=end
