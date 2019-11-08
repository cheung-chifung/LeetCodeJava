package com.chifungcheung.leetcode.solutions.s213;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    int ans = sol.rob(new int[] { 2, 3, 2 });
    assertEquals(3, ans);
  }

  @Test
  public void testSolution002() {
    int ans = sol.rob(new int[] { 1, 2, 3, 1 });
    assertEquals(4, ans);
  }

  @Test
  public void testSolution003() {
    int ans = sol.rob(new int[] { 4, 1, 2, 7, 5, 3, 1 });
    assertEquals(14, ans);
  }
}
