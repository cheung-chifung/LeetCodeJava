package com.chifungcheung.leetcode.solutions.s144;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import com.chifungcheung.leetcode.data.TreeNode;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution() {
    Solution sol = new Solution();
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    List<Integer> ans = sol.preorderTraversal(root);

    assertArrayEquals(new Integer[] { 1, 2, 3 }, ans.toArray());
  }
}
