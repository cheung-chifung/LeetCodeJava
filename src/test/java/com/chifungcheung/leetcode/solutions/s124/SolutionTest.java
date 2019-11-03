package com.chifungcheung.leetcode.solutions.s124;

import static org.junit.Assert.assertEquals;

import com.chifungcheung.leetcode.data.TreeNode;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    TreeNode head = new TreeNode(-10);
    head.left = new TreeNode(9);
    head.right = new TreeNode(20);
    head.right.left = new TreeNode(15);
    head.right.right = new TreeNode(7);
    int ans = sol.maxPathSum(head);
    assertEquals(42, ans);
  }

  @Test
  public void testSolution002() {
    TreeNode head = new TreeNode(0);
    int ans = sol.maxPathSum(head);
    assertEquals(0, ans);
  }

  @Test
  public void testSolution003() {
    TreeNode head = new TreeNode(1);
    head.left = new TreeNode(2);
    head.right = new TreeNode(3);
    int ans = sol.maxPathSum(head);
    assertEquals(6, ans);
  }
}
