package com.chifungcheung.leetcode.solutions.s103;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.List;

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
    List<List<Integer>> ans = sol.zigzagLevelOrder(root);
    assertEquals(3, ans.size());
    assertArrayEquals(new Integer[] { 3 }, ans.get(0).toArray());
    assertArrayEquals(new Integer[] { 20, 9 }, ans.get(1).toArray());
    assertArrayEquals(new Integer[] { 15, 7 }, ans.get(2).toArray());
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.right.right = new TreeNode(5);
    List<List<Integer>> ans = sol.zigzagLevelOrder(root);
    assertEquals(3, ans.size());
    assertArrayEquals(new Integer[] { 1 }, ans.get(0).toArray());
    assertArrayEquals(new Integer[] { 3, 2 }, ans.get(1).toArray());
    assertArrayEquals(new Integer[] { 4, 5 }, ans.get(2).toArray());
  }
}
