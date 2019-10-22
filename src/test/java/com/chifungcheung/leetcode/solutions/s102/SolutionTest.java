package com.chifungcheung.leetcode.solutions.s102;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.List;

import com.chifungcheung.leetcode.data.TreeNode;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution() {
    Solution sol = new Solution();
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    List<List<Integer>> ans = sol.levelOrder(root);
    assertEquals(3, ans.size());
    assertArrayEquals(new Integer[] { 3 }, ans.get(0).toArray());
    assertArrayEquals(new Integer[] { 9, 20 }, ans.get(1).toArray());
    assertArrayEquals(new Integer[] { 15, 7 }, ans.get(2).toArray());
  }
}
