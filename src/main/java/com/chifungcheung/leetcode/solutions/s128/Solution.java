package com.chifungcheung.leetcode.solutions.s128;

import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
  public int longestConsecutive(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }
    int maxLen = 0;
    for (int i = 0; i < nums.length; i++) {
      if (!set.contains(nums[i] - 1)) {
        int k = nums[i];
        while (set.contains(++k)) {
        }
        maxLen = Math.max(maxLen, k - nums[i]);
      }
    }
    return maxLen;
  }
}
// @lc code=end

