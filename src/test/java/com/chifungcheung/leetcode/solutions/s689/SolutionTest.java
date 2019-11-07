package com.chifungcheung.leetcode.solutions.s689;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    int[] ans = sol.maxSumOfThreeSubarrays(new int[] { 1, 2, 1, 2, 6, 7, 5, 1 }, 2);
    assertArrayEquals(new int[] { 0, 3, 5 }, ans);
  }

  @Test
  public void testSolution002() {
    int[] ans = sol.maxSumOfThreeSubarrays(new int[] { 4, 5, 10, 6, 11, 17, 4, 11, 1, 3 }, 1);
    assertArrayEquals(new int[] { 4, 5, 7 }, ans);
  }

  @Test
  public void testSolution003() {
    int[] ans = sol.maxSumOfThreeSubarrays(new int[] { 1, 2, 1, 2, 1, 2, 1, 2, 1 }, 2);
    assertArrayEquals(new int[] { 0, 2, 4 }, ans);
  }
}
