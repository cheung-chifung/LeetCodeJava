package com.chifungcheung.leetcode.solutions.s231;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();

    assertEquals(true, sol.isPowerOfTwo(1));
    assertEquals(true, sol.isPowerOfTwo(16));
    assertEquals(false, sol.isPowerOfTwo(218));
  }
}
