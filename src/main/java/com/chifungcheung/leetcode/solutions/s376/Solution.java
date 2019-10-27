package com.chifungcheung.leetcode.solutions.s376;

/*
 * @lc app=leetcode id=376 lang=java
 *
 * [376] Wiggle Subsequence
 */

// @lc code=start
class Solution {
  public int wiggleMaxLength(int[] nums) {
    if (nums.length <= 1) {
      return nums.length;
    }
    int inc = nums[1] - nums[0];
    int ans = inc == 0 ? 1 : 2;
    for (int i = 1; i < nums.length - 1; i++) {
      int trend = nums[i + 1] - nums[i];
      if ((trend > 0 && inc < 0) || (trend < 0 && inc > 0)) {
        ans++;
        inc = -inc;
      } else if (trend != 0 && inc == 0) {
        ans++;
        inc = trend;
      }
    }
    return ans;
  }
}
// @lc code=end
