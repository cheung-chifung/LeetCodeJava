package com.chifungcheung.leetcode.solutions.s872;

import java.util.Stack;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=872 lang=java
 *
 * [872] Leaf-Similar Trees
 */

// @lc code=start
class Solution {
  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    Stack<TreeNode> sequence1 = new Stack<>();
    Stack<TreeNode> sequence2 = new Stack<>();
    this.leafSequence(root1, sequence1);
    this.leafSequence(root2, sequence2);

    while (!sequence1.isEmpty() && !sequence2.isEmpty()) {
      TreeNode n1 = sequence1.pop();
      TreeNode n2 = sequence2.pop();
      if (n1.val != n2.val) {
        return false;
      }
    }
    return sequence1.isEmpty() && sequence2.isEmpty();
  }

  private void leafSequence(TreeNode root, Stack<TreeNode> sequence) {
    if (root == null) {
      return;
    }
    if (root.left == null && root.right == null) {
      sequence.push(root);
      return;
    }
    leafSequence(root.left, sequence);
    leafSequence(root.right, sequence);
  }

}
// @lc code=end
