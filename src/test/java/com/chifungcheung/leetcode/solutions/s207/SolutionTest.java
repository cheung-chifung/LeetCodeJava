package com.chifungcheung.leetcode.solutions.s207;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();

    boolean ans = sol.canFinish(2, new int[][] { new int[] { 1, 0 }, });
    assertEquals(true, ans);
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();

    boolean ans = sol.canFinish(2, new int[][] { new int[] { 1, 0 }, new int[] { 0, 1 } });
    assertEquals(false, ans);
  }
}
