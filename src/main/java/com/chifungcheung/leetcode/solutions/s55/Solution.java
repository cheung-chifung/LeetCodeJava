package com.chifungcheung.leetcode.solutions.s55;

/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
  public boolean canJump(int[] nums) {
    int n = nums.length;
    if (n == 1) {
      return true;
    }
    int last = n - 1;
    for (int i = n - 1; i >= 0; i--) {
      if (i + nums[i] >= last) {
        last = i;
      }
    }
    return last == 0;
  }
}
// @lc code=end
