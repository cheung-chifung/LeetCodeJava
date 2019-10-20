package com.chifungcheung.leetcode.solutions.s113;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution1() {
    Solution sol = new Solution();

    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(4);
    root.right = new TreeNode(8);
    root.left.left = new TreeNode(11);
    root.right.left = new TreeNode(13);
    root.right.right = new TreeNode(4);
    root.left.left.left = new TreeNode(7);
    root.left.left.right = new TreeNode(2);
    root.right.right.left = new TreeNode(5);
    root.right.right.right = new TreeNode(1);

    List<List<Integer>> ans = sol.pathSum(root, 22);
    assertEquals(2, ans.size());
    assertArrayEquals(new Integer[] { 5, 4, 11, 2 }, ans.get(0).toArray());
    assertArrayEquals(new Integer[] { 5, 8, 4, 5 }, ans.get(1).toArray());
  }

  @Test
  public void testSolution2() {
    Solution sol = new Solution();

    TreeNode root = new TreeNode(5);

    List<List<Integer>> ans = sol.pathSum(root, 5);
    assertEquals(1, ans.size());
    assertArrayEquals(new Integer[] { 5 }, ans.get(0).toArray());
  }

  @Test
  public void testSolution3() {
    Solution sol = new Solution();

    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);

    List<List<Integer>> ans = sol.pathSum(root, 1);
    assertEquals(0, ans.size());
  }
}
