package com.chifungcheung.leetcode.solutions.s41;

/*
 * @lc app=leetcode id=41 lang=java
 *
 * [41] First Missing Positive
 */

// @lc code=start
class Solution {
  public int firstMissingPositive(int[] nums) {
    int n = nums.length;
    if (n == 0) {
      return 1;
    }
    int i = 0;
    while (i < n) {
      if (nums[i] < 1 || nums[i] > n || nums[i] == i + 1 || nums[nums[i] - 1] == nums[i]) {
        i++;
      } else {
        int temp = nums[nums[i] - 1];
        nums[nums[i] - 1] = nums[i];
        nums[i] = temp;
      }
    }
    for (i = 0; i < n; i++) {
      if (nums[i] != i + 1) {
        return i + 1;
      }
    }
    return i + 1;
  }
}
// @lc code=end
