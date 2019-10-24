package com.chifungcheung.leetcode.solutions.s117;

import java.util.ArrayDeque;
import java.util.Queue;

import com.chifungcheung.leetcode.data.Node;

/*
 * @lc app=leetcode id=117 lang=java
 *
 * [117] Populating Next Right Pointers in Each Node II
 */

// @lc code=start
class Solution {
  public Node connect(Node root) {
    Node origRoot = root;
    Node dummy = new Node();
    Node prev = dummy;
    while (root != null) {
      if (root.left != null) {
        prev.next = root.left;
        prev = prev.next;
      }
      if (root.right != null) {
        prev.next = root.right;
        prev = prev.next;
      }
      root = root.next;
      if (root == null) {
        prev = dummy;
        root = dummy.next;
        dummy.next = null;
      }
    }
    return origRoot;
  }
}
// @lc code=end
