package com.chifungcheung.leetcode.solutions.s46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start
class Solution {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    backtrack(ans, new LinkedList<>(), nums);
    return ans;
  }

  private void backtrack(List<List<Integer>> ans, List<Integer> list, int[] nums) {
    if (list.size() == nums.length) {
      ans.add(new ArrayList<>(list));
    } else {
      for (int i = 0; i < nums.length; i++) {
        if (list.contains(nums[i])) {
          continue;
        }
        list.add(nums[i]);
        backtrack(ans, list, nums);
        list.remove(list.size() - 1);
      }
    }
  }
}
// @lc code=end
