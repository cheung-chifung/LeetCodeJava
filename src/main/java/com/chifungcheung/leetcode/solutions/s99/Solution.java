package com.chifungcheung.leetcode.solutions.s99;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=99 lang=java
 *
 * [99] Recover Binary Search Tree
 */

// @lc code=start
class Solution {
  public void recoverTree(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    this.dfs(root, stack);

    List<Integer> ordered = stack.stream().map(n -> n.val).sorted().collect(Collectors.toList());
    int i = 0;
    for (TreeNode node : stack) {
      node.val = ordered.get(i);
      i++;
    }
  }

  private void dfs(TreeNode root, Stack<TreeNode> stack) {
    if (root == null) {
      return;
    }
    this.dfs(root.left, stack);
    stack.push(root);
    this.dfs(root.right, stack);
  }
}
// @lc code=end
