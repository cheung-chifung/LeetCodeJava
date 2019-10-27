package com.chifungcheung.leetcode.solutions.s404;

import static org.junit.Assert.assertEquals;

import com.chifungcheung.leetcode.data.TreeNode;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    assertEquals(24, sol.sumOfLeftLeaves(root));
  }
}
