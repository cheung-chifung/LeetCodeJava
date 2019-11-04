package com.chifungcheung.leetcode.solutions.s349;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution1() {
    int[] ans = sol.intersection(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 });
    assertArrayEquals(new int[] { 2 }, ans);
  }

  @Test
  public void testSolution2() {
    int[] ans = sol.intersection(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 });
    assertArrayEquals(new int[] { 4, 9 }, ans);
  }
}
