package com.chifungcheung.leetcode.solutions.s226;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
 */

// @lc code=start
class Solution {
  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return root;
    }
    this.invertTree(root.left);
    this.invertTree(root.right);

    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;

    return root;
  }
}
// @lc code=end
