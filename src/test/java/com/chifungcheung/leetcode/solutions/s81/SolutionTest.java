package com.chifungcheung.leetcode.solutions.s81;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    assertEquals(true, sol.search(new int[] { 2, 5, 6, 0, 0, 1, 2 }, 0));
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    assertEquals(false, sol.search(new int[] { 2, 5, 6, 0, 0, 1, 2 }, 3));
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    assertEquals(true, sol.search(new int[] { 2, 5, 6, 0, 0, 1, 2 }, 6));
  }

  @Test
  public void testSolution004() {
    Solution sol = new Solution();
    assertEquals(true, sol.search(new int[] { 2, 5, 6, 0, 0, 1, 2 }, 2));
  }

  @Test
  public void testSolution005() {
    Solution sol = new Solution();
    assertEquals(true, sol.search(new int[] { 1, 1, 3, 1 }, 3));
  }

  // 1 - (1) -3 - 1
  // 3 - (1) -1 - 1
  // 0 - (1) -1 - 1

  @Test
  public void testSolution006() {
    Solution sol = new Solution();
    assertEquals(true, sol.search(new int[] { 3, 1, 1, 1 }, 3));
  }

  @Test
  public void testSolution007() {
    Solution sol = new Solution();
    assertEquals(true, sol.search(new int[] { 1, 2, 2, 2, 0, 1, 1 }, 0));
  }
}
