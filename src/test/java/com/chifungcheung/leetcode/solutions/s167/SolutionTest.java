package com.chifungcheung.leetcode.solutions.s167;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution() {
    int[] ans = sol.twoSum(new int[] { 2, 7, 11, 15 }, 9);
    assertArrayEquals(new int[] { 1, 2 }, ans);
  }
}
