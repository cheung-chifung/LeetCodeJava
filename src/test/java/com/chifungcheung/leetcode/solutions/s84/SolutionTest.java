package com.chifungcheung.leetcode.solutions.s84;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    int[] heights = new int[] { 2, 1, 5, 6, 2, 3 };
    int ans = sol.largestRectangleArea(heights);
    assertEquals(10, ans);
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    int[] heights = new int[] { 1, 2, 2 };
    int ans = sol.largestRectangleArea(heights);
    assertEquals(4, ans);
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    int[] heights = new int[] { 4, 2, 0, 3, 2, 5 };
    int ans = sol.largestRectangleArea(heights);
    assertEquals(6, ans);
  }
}
