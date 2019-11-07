package com.chifungcheung.leetcode.solutions.s78;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    Stack<Integer> stack = new Stack<>();
    backtrack(ans, stack, nums, 0);
    return ans;
  }

  private void backtrack(List<List<Integer>> ans, Stack<Integer> stack, int[] nums, int start) {
    ans.add(new ArrayList<Integer>(stack));
    for (int i = start; i < nums.length; i++) {
      stack.push(nums[i]);
      backtrack(ans, stack, nums, i + 1);
      stack.pop();
    }
  }
}
// @lc code=end
