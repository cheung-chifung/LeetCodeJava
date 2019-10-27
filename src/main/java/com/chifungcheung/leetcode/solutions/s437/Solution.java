package com.chifungcheung.leetcode.solutions.s437;

import java.util.HashMap;
import java.util.Map;
import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=437 lang=java
 *
 * [437] Path Sum III
 */

// @lc code=start
class Solution {
  public int pathSum(TreeNode root, int sum) {
    Map<Integer, Integer> d = new HashMap<>();
    d.put(0, 1);
    return subPathSum(root, sum, 0, d);
  }

  private int subPathSum(TreeNode root, int sum, int acc, Map<Integer, Integer> d) {
    if (root == null) {
      return 0;
    }
    acc += root.val;
    int rc = d.getOrDefault(acc - sum, 0);
    d.put(acc, d.getOrDefault(acc, 0) + 1);
    int left = subPathSum(root.left, sum, acc, d);
    int right = subPathSum(root.right, sum, acc, d);
    d.put(acc, d.get(acc) - 1);
    return rc + left + right;
  }
}
// @lc code=end
