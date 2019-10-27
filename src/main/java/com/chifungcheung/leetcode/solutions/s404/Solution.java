package com.chifungcheung.leetcode.solutions.s404;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=404 lang=java
 *
 * [404] Sum of Left Leaves
 */

// @lc code=start
class Solution {
  public int sumOfLeftLeaves(TreeNode root) {
    return dfs(root, false);
  }

  public int dfs(TreeNode root, boolean isLeft) {
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      return isLeft ? root.val : 0;
    }
    return dfs(root.left, true) + dfs(root.right, false);
  }
}
// @lc code=end
