package com.chifungcheung.leetcode.solutions.s204;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution() {
    Solution sol = new Solution();

    assertEquals(4, sol.countPrimes(10));
    assertEquals(25, sol.countPrimes(100));
  }
}
