package com.chifungcheung.leetcode.solutions.s287;

/*
 * @lc app=leetcode id=287 lang=java
 *
 * [287] Find the Duplicate Number
 */

// @lc code=start
class Solution {
  public int findDuplicate(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      while (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
        int bk = nums[nums[i] - 1];
        nums[nums[i] - 1] = nums[i];
        nums[i] = bk;
      }
      i++;
    }
    for (i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1) {
        return nums[i];
      }
    }
    return -1;
  }
}
// @lc code=end
