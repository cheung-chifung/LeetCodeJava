package com.chifungcheung.leetcode.solutions.s268;

/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
  public int missingNumber(int[] nums) {
    boolean hasZero = false;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        hasZero = true;
        break;
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == i + 1) {
        continue;
      } else {
        while (nums[i] > 0 && nums[i] != nums[nums[i] - 1]) {
          int tmp = nums[nums[i] - 1];
          nums[nums[i] - 1] = nums[i];
          nums[i] = tmp;
        }
      }
    }
    if (!hasZero) {
      return 0;
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        return i + 1;
      }
    }
    return nums.length;
  }
}
// @lc code=end
