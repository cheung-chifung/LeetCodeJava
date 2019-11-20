package com.chifungcheung.leetcode.solutions.s236;

import java.util.Stack;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=236 lang=java
 *
 * [236] Lowest Common Ancestor of a Binary Tree
 */

// @lc code=start
class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    Stack<TreeNode> pStack = new Stack<>();
    Stack<TreeNode> qStack = new Stack<>();

    dfs(root, p, pStack);
    dfs(root, q, qStack);

    if (pStack.isEmpty() || qStack.isEmpty()) {
      return null;
    }
    for (int i = pStack.size() - 1; i >= 0; i--) {
      for (int j = qStack.size() - 1; j >= 0; j--) {
        TreeNode pAns = pStack.get(i);
        TreeNode qAns = qStack.get(j);
        if (pAns.val == qAns.val) {
          return pAns;
        }
      }
    }

    return null;
  }

  private boolean dfs(TreeNode root, TreeNode target, Stack<TreeNode> stack) {
    if (root == null) {
      return false;
    }
    stack.push(root);
    if (root.val == target.val) {
      return true;
    }
    if (dfs(root.left, target, stack)) {
      return true;
    }
    if (dfs(root.right, target, stack)) {
      return true;
    }
    stack.pop();
    return false;
  }
}
// @lc code=end
