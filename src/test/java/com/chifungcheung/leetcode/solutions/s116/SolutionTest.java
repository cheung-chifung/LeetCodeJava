package com.chifungcheung.leetcode.solutions.s116;

import com.chifungcheung.leetcode.data.tree.Node;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution1() {
    Solution sol = new Solution();

    Node root = new Node(1, null, null, null);
    root.left = new Node(2, null, null, null);
    root.right = new Node(3, null, null, null);
    root.left.left = new Node(4, null, null, null);
    root.left.right = new Node(5, null, null, null);
    root.right.left = new Node(6, null, null, null);
    root.right.right = new Node(7, null, null, null);
    sol.connect(root);
  }
}
