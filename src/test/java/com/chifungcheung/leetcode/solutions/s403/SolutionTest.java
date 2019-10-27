package com.chifungcheung.leetcode.solutions.s403;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    assertEquals(true, sol.canCross(new int[] { 0, 1, 3, 5, 6, 8, 12, 17 }));
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    assertEquals(false, sol.canCross(new int[] { 0, 1, 2, 3, 4, 8, 9, 11 }));
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    assertEquals(false, sol.canCross(new int[] { 0, 2 }));
  }
}
