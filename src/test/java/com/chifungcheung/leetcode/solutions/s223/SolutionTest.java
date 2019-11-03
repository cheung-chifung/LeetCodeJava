package com.chifungcheung.leetcode.solutions.s223;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    assertEquals(45, sol.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
  }

  @Test
  public void testSolution002() {
    assertEquals(2, sol.computeArea(-1500000001, 0, -1500000000, 1, 1500000000, 0, 1500000001, 1));
  }
}
