package com.chifungcheung.leetcode.solutions.s162;

/*
 * @lc app=leetcode id=162 lang=java
 *
 * [162] Find Peak Element
 */

// @lc code=start
class Solution {
  public int findPeakElement(int[] nums) {
    if (nums.length == 1) {
      return 0;
    }
    int left = 0, right = nums.length - 1;
    while (left < right) {
      int mid = left + (right - left) / 2;
      boolean leftPeak = (mid == 0 || nums[mid - 1] < nums[mid]);
      boolean rightPeak = (mid == nums.length - 1 || nums[mid] > nums[mid + 1]);
      if (leftPeak && rightPeak) {
        return mid;
      }
      if (leftPeak) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    return left;
  }
}
// @lc code=end
