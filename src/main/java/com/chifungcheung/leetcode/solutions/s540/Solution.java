package com.chifungcheung.leetcode.solutions.s540;

/*
 * @lc app=leetcode id=540 lang=java
 *
 * [540] Single Element in a Sorted Array
 */

// @lc code=start
class Solution {
  public int singleNonDuplicate(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    Integer lastPair = null;
    for (int i = 0; i < nums.length; i++) {
      if (lastPair == null) {
        lastPair = nums[i];
      } else if (lastPair == nums[i]) {
        lastPair = null;
      } else {
        return lastPair;
      }
    }
    return lastPair;
  }
}
// @lc code=end
