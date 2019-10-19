package com.chifungcheung.leetcode.solutions.s145;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution() {
    Solution sol = new Solution();
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    List<Integer> ans = sol.postorderTraversal(root);

    assertArrayEquals(new Integer[] { 3, 2, 1 }, ans.toArray());
  }
}
