package com.chifungcheung.leetcode.solutions.s117;

import com.chifungcheung.leetcode.data.Node;

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
    root.right.right = new Node(7, null, null, null);
    sol.connect(root);
  }

  @Test
  public void testSolution2() {
    Solution sol = new Solution();

    Node root = new Node(1, null, null, null);
    root.left = new Node(2, null, null, null);
    root.right = new Node(3, null, null, null);
    root.left.left = new Node(4, null, null, null);
    root.left.right = new Node(5, null, null, null);
    root.right.right = new Node(6, null, null, null);
    root.left.left.left = new Node(7, null, null, null);
    root.right.right.right = new Node(8, null, null, null);
    sol.connect(root);
  }

  @Test
  public void testSolution3() {
    Solution sol = new Solution();

    Node root = new Node(2, null, null, null);
    root.left = new Node(1, null, null, null);
    root.right = new Node(3, null, null, null);
    root.left.left = new Node(0, null, null, null);
    root.left.right = new Node(7, null, null, null);
    root.right.left = new Node(9, null, null, null);
    root.right.right = new Node(1, null, null, null);
    root.left.left.left = new Node(2, null, null, null);
    root.left.right.left = new Node(1, null, null, null);
    root.left.right.right = new Node(0, null, null, null);
    root.right.right.left = new Node(8, null, null, null);
    root.right.right.right = new Node(8, null, null, null);
    root.left.right.right.left = new Node(7, null, null, null);
    sol.connect(root);
  }
}
