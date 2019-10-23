package com.chifungcheung.leetcode.solutions.s33;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    assertEquals(4, sol.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    assertEquals(-1, sol.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3));
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    assertEquals(6, sol.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 2));
  }
}
