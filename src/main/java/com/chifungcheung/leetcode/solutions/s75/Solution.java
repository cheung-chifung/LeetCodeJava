package com.chifungcheung.leetcode.solutions.s75;

/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
  public void sortColors(int[] nums) {
    int n0 = 0, n1 = 0, n2 = 0;
    for (int num : nums) {
      if (num == 0) {
        n0++;
      } else if (num == 1) {
        n1++;
      } else if (num == 2) {
        n2++;
      }
    }
    for (int i = 0; i < n0; i++) {
      nums[i] = 0;
    }
    for (int i = n0; i < n0 + n1; i++) {
      nums[i] = 1;
    }
    for (int i = n0 + n1; i < n0 + n1 + n2; i++) {
      nums[i] = 2;
    }
  }
}
// @lc code=end

