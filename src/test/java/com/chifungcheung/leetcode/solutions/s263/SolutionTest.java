package com.chifungcheung.leetcode.solutions.s263;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    assertEquals(true, sol.isUgly(6));
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    assertEquals(true, sol.isUgly(8));
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    assertEquals(false, sol.isUgly(14));
  }
}
