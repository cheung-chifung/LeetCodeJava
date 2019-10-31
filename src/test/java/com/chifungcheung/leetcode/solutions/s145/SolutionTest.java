package com.chifungcheung.leetcode.solutions.s145;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import com.chifungcheung.leetcode.data.TreeNode;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    List<Integer> ans = sol.postorderTraversal(root);

    assertArrayEquals(new Integer[] { 3, 2, 1 }, ans.toArray());
  }

  @Test
  public void testSolution002() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(1);
    root.right = new TreeNode(2);
    List<Integer> ans = sol.postorderTraversal(root);

    assertArrayEquals(new Integer[] { 1, 2, 3 }, ans.toArray());
  }
}
