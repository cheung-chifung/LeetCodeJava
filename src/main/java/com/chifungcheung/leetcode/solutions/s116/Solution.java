package com.chifungcheung.leetcode.solutions.s116;

import com.chifungcheung.leetcode.data.Node;

/*
 * @lc app=leetcode id=116 lang=java
 *
 * [116] Populating Next Right Pointers in Each Node
 */

// @lc code=start
class Solution {
  public Node connect(Node root) {
    this.bfs(root);
    return root;
  }

  private void bfs(Node root) {
    if (root == null) {
      return;
    }
    if (root.left != null) {
      root.left.next = root.right;
    }
    if (root.right != null && root.next != null) {
      root.right.next = root.next.left;
    }
    this.bfs(root.left);
    this.bfs(root.right);
  }
}
// @lc code=end
