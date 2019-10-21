package com.chifungcheung.leetcode.solutions.s538;

import java.util.Stack;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=538 lang=java
 *
 * [538] Convert BST to Greater Tree
 */

// @lc code=start
class Solution {
  public TreeNode convertBST(TreeNode root) {
    if (root == null) {
      return root;
    }
    Stack<TreeNode> stack = new Stack<>();
    this.push(root, stack);

    int acc = 0;
    while (!stack.empty()) {
      TreeNode node = stack.pop();
      int v = node.val;
      node.val += acc;
      acc += v;

    }
    return root;
  }

  private void push(TreeNode root, Stack<TreeNode> stack) {
    if (root == null) {
      return;
    }
    this.push(root.left, stack);
    stack.add(root);
    this.push(root.right, stack);
  }
}
// @lc code=end
