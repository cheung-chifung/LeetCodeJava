package com.chifungcheung.leetcode.solutions.s201;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    assertEquals(4, sol.rangeBitwiseAnd(5, 7));
  }

  @Test
  public void testSolution002() {
    assertEquals(0, sol.rangeBitwiseAnd(0, 1));
  }

  @Test
  public void testSolution003() {
    assertEquals(0, sol.rangeBitwiseAnd(0, 2147483647));
  }

  @Test
  public void testSolution004() {
    assertEquals(2147483646, sol.rangeBitwiseAnd(2147483646, 2147483647));
  }

  @Test
  public void testSolution005() {
    assertEquals(1, sol.rangeBitwiseAnd(1, 1));
  }
}
