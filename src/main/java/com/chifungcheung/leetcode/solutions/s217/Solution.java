package com.chifungcheung.leetcode.solutions.s217;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
  public boolean containsDuplicate(int[] nums) {
    Map<Integer, Boolean> d = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (d.containsKey(nums[i])) {
        return true;
      }
      d.put(nums[i], true);
    }
    return false;
  }
}
// @lc code=end
