package com.chifungcheung.leetcode.solutions.s376;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    assertEquals(6, sol.wiggleMaxLength(new int[] { 1, 7, 4, 9, 2, 5 }));
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    assertEquals(7, sol.wiggleMaxLength(new int[] { 1, 17, 5, 10, 13, 15, 10, 5, 16, 8 }));
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    assertEquals(2, sol.wiggleMaxLength(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
  }

  @Test
  public void testSolution004() {
    Solution sol = new Solution();
    assertEquals(2, sol.wiggleMaxLength(new int[] { 0, 1, 1 }));
  }

  @Test
  public void testSolution005() {
    Solution sol = new Solution();
    assertEquals(1, sol.wiggleMaxLength(new int[] { 1, 1, 1 }));
  }

  @Test
  public void testSolution006() {
    Solution sol = new Solution();
    assertEquals(3, sol.wiggleMaxLength(new int[] { 3, 3, 3, 2, 5 }));
  }
}
