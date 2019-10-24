package com.chifungcheung.leetcode.solutions.s94;

import java.util.ArrayList;
import java.util.List;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 */

// @lc code=start
class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> ans = new ArrayList<>();
    this.inorder(root, ans);
    return ans;
  }

  private void inorder(TreeNode root, List<Integer> ans) {
    if (root == null) {
      return;
    }
    this.inorder(root.left, ans);
    ans.add(root.val);
    this.inorder(root.right, ans);
  }
}
// @lc code=end
