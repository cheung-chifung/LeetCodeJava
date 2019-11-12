package com.chifungcheung.leetcode.solutions.s123;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    int ans = sol.maxProfit(new int[] { 3, 3, 5, 0, 0, 3, 1, 4 });
    assertEquals(6, ans);
  }

  @Test
  public void testSolution002() {
    int ans = sol.maxProfit(new int[] { 1, 2, 3, 4, 5 });
    assertEquals(4, ans);
  }

  @Test
  public void testSolution003() {
    int ans = sol.maxProfit(new int[] { 7, 6, 4, 3, 1 });
    assertEquals(0, ans);
  }

  @Test
  public void testSolution004() {
    int ans = sol.maxProfit(new int[] { 2, 1, 2, 0, 1 });
    assertEquals(2, ans);
  }
}
