package com.chifungcheung.leetcode.solutions.s257;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.util.Arrays;
import java.util.List;

import com.chifungcheung.leetcode.data.TreeNode;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution() {
    Solution sol = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(5);
    List<String> ans = sol.binaryTreePaths(root);

    List<String> expected = Arrays.asList("1->2->5", "1->3");
    assertThat(ans, is(expected));
  }
}
