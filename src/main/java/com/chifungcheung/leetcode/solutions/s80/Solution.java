package com.chifungcheung.leetcode.solutions.s80;

/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
class Solution {
  public int removeDuplicates(int[] nums) {
    int s = 0;
    Integer uniqNum = null;
    int i = 0;
    int ans = 0;
    while (i < nums.length) {
      if (uniqNum == null || !uniqNum.equals(nums[i])) {
        uniqNum = nums[i];
        nums[s] = nums[i];
        ans++;
      } else {
        nums[s] = nums[i];
        ans++;
        while (i + 1 < nums.length && uniqNum.equals(nums[i + 1])) {
          i++;
        }
        uniqNum = null;
      }
      s++;
      i++;
    }
    return ans;
  }
}
// @lc code=end
