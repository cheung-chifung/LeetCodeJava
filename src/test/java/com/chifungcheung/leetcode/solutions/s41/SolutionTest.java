package com.chifungcheung.leetcode.solutions.s41;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    int[] arr = new int[] { 1, 2, 0 };
    assertEquals(3, sol.firstMissingPositive(arr));
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    int[] arr = new int[] { 3, 4, -1, 1 };
    assertEquals(2, sol.firstMissingPositive(arr));
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    int[] arr = new int[] { 7, 8, 9, 11, 12 };
    assertEquals(1, sol.firstMissingPositive(arr));
  }
}
