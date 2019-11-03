package com.chifungcheung.leetcode.solutions.s367;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    assertEquals(true, sol.isPerfectSquare(16));
  }

  @Test
  public void testSolution002() {
    assertEquals(false, sol.isPerfectSquare(14));
  }

  @Test
  public void testSolution003() {
    assertEquals(false, sol.isPerfectSquare(2));
  }

  @Test
  public void testSolution004() {
    assertEquals(true, sol.isPerfectSquare(808201));
  }
}
