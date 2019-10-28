package com.chifungcheung.leetcode.solutions.s91;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    assertEquals(3, sol.numDecodings("226"));
  }

  @Test
  public void testSolution002() {
    assertEquals(2, sol.numDecodings("12"));
  }

  @Test
  public void testSolution003() {
    assertEquals(0, sol.numDecodings("01"));
  }
}
