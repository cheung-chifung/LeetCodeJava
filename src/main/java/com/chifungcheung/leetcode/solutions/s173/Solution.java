package com.chifungcheung.leetcode.solutions.s173;

import java.util.Stack;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=173 lang=java
 *
 * [173] Binary Search Tree Iterator
 */

// @lc code=start
class BSTIterator {
  private Stack<TreeNode> stack;

  public BSTIterator(TreeNode root) {
    stack = new Stack<>();
    pushLeft(root);
  }

  /** @return the next smallest number */
  public int next() {
    TreeNode n = stack.pop();
    if (n.right != null) {
      pushLeft(n.right);
    }
    return n.val;
  }

  /** @return whether we have a next smallest number */
  public boolean hasNext() {
    return !stack.isEmpty();
  }

  private void pushLeft(TreeNode root) {
    TreeNode head = root;
    while (head != null) {
      stack.add(head);
      head = head.left;
    }
  }
}

// @lc code=end
