package com.chifungcheung.leetcode.solutions.s338;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    int[] ans = sol.countBits(2);
    assertArrayEquals(new int[] { 0, 1, 1 }, ans);
  }

  @Test
  public void testSolution002() {
    int[] ans = sol.countBits(5);
    assertArrayEquals(new int[] { 0, 1, 1, 2, 1, 2 }, ans);
  }

  @Test
  public void testSolution003() {
    int[] ans = sol.countBits(0);
    assertArrayEquals(new int[] { 0 }, ans);
  }

  @Test
  public void testSolution004() {
    int[] ans = sol.countBits(1);
    assertArrayEquals(new int[] { 0, 1 }, ans);
  }

  @Test
  public void testSolution005() {
    int[] ans = sol.countBits(9);
    assertArrayEquals(new int[] { 0, 1, 1, 2, 1, 2, 2, 3, 1, 2 }, ans);
  }
}
