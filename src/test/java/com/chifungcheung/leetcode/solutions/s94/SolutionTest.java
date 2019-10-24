package com.chifungcheung.leetcode.solutions.s94;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import com.chifungcheung.leetcode.data.TreeNode;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    List<Integer> ans = sol.inorderTraversal(root);
    assertArrayEquals(new Integer[] { 1, 3, 2 }, ans.toArray());
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    List<Integer> ans = sol.inorderTraversal(root);
    assertArrayEquals(new Integer[] { 4, 2, 5, 1, 3 }, ans.toArray());
  }
}
