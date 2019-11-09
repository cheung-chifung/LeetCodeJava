package com.chifungcheung.leetcode.solutions.s300;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    int ans = sol.lengthOfLIS(new int[] { 10, 9, 2, 5, 3, 4 });
    assertEquals(3, ans);
  }

  @Test
  public void testSolution002() {
    int ans = sol.lengthOfLIS(new int[] { 10, 9, 2, 5, 3, 7, 101, 18 });
    assertEquals(4, ans);
  }

  @Test
  public void testSolution003() {
    int ans = sol.lengthOfLIS(new int[] { 1, 3, 6, 7, 9, 4, 10, 5, 6 });
    assertEquals(6, ans);
  }

  @Test
  public void testSolution004() {
    int ans = sol.lengthOfLIS(new int[] { 3, 1, 2 });
    assertEquals(2, ans);
  }
}
