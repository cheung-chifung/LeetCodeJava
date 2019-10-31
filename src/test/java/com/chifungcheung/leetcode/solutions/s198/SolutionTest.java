package com.chifungcheung.leetcode.solutions.s198;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();

    int ans = sol.rob(new int[] { 1, 2, 3, 1 });
    assertEquals(4, ans);
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();

    int ans = sol.rob(new int[] { 2, 7, 9, 3, 1 });
    assertEquals(12, ans);
  }
}
