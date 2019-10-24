package com.chifungcheung.leetcode.solutions.s94b;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    Stack<TreeNode> stack = new Stack<>();
    if (root == null) {
      return ans;
    }
    while (root != null || !stack.empty()) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      ans.add(root.val);
      root = root.right;
    }
    return ans;
  }
}
// @lc code=end
