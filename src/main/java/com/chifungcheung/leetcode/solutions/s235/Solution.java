package com.chifungcheung.leetcode.solutions.s235;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=235 lang=java
 *
 * [235] Lowest Common Ancestor of a Binary Search Tree
 */

// @lc code=start
class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (p.val > q.val) {
      TreeNode tmp = p;
      p = q;
      q = tmp;
    }
    return dfs(root, p, q);
  }

  private TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) {
      return null;
    }
    if (root.val >= p.val && root.val <= q.val) {
      return root;
    }
    if (root.val > p.val && root.val > q.val) {
      return dfs(root.left, p, q);
    }
    return dfs(root.right, p, q);
  }
}
// @lc code=end
