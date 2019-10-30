package com.chifungcheung.leetcode.solutions.s268;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    int ans = sol.missingNumber(new int[] { 3, 0, 1 });
    assertEquals(2, ans);
  }

  @Test
  public void testSolution002() {
    int ans = sol.missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 });
    assertEquals(8, ans);
  }

  @Test
  public void testSolution003() {
    int ans = sol.missingNumber(new int[] { 0, 1 });
    assertEquals(2, ans);
  }

  @Test
  public void testSolution004() {
    int ans = sol.missingNumber(new int[] { 0, 2 });
    assertEquals(1, ans);
  }

  @Test
  public void testSolution005() {
    int ans = sol.missingNumber(new int[] { 2, 0 });
    assertEquals(1, ans);
  }

  @Test
  public void testSolution006() {
    int ans = sol.missingNumber(new int[] { 0, 3, 1 });
    assertEquals(2, ans);
  }
}
