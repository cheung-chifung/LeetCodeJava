package com.chifungcheung.leetcode.solutions.s106;

import com.chifungcheung.leetcode.data.TreeNode;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    TreeNode root = sol.buildTree(new int[] { 9, 3, 15, 20, 7 }, new int[] { 9, 15, 7, 20, 3 });
  }
}
