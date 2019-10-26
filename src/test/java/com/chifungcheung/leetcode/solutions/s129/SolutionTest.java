package com.chifungcheung.leetcode.solutions.s129;

import static org.junit.Assert.assertEquals;
import com.chifungcheung.leetcode.data.TreeNode;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution1() {
    Solution sol = new Solution();

    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(9);
    root.right = new TreeNode(0);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(1);

    int ans = sol.sumNumbers(root);
    assertEquals(1026, ans);
  }

  @Test
  public void testSolution2() {
    Solution sol = new Solution();

    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    int ans = sol.sumNumbers(root);
    assertEquals(25, ans);
  }
}
