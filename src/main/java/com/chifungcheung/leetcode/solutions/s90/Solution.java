package com.chifungcheung.leetcode.solutions.s90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

// @lc code=start
class Solution {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(ans, new Stack<Integer>(), nums, 0);
    return ans;
  }

  private void backtrack(List<List<Integer>> ans, Stack<Integer> stack, int[] nums, int start) {
    ans.add(new ArrayList<Integer>(stack));
    for (int i = start; i < nums.length; i++) {
      if (i > start && nums[i] == nums[i - 1]) {
        continue;
      }
      stack.push(nums[i]);
      backtrack(ans, stack, nums, i + 1);
      stack.pop();
    }
  }
}
// @lc code=end
