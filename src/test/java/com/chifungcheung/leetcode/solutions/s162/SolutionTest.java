package com.chifungcheung.leetcode.solutions.s162;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    int ans = sol.findPeakElement(new int[] { 1, 2, 3, 1 });
    assertEquals(2, ans);
  }

  @Test
  public void testSolution002() {
    int ans = sol.findPeakElement(new int[] { 1, 2, 1, 3, 5, 6, 4 });
    assertEquals(5, ans);
  }
}
