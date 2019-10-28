package com.chifungcheung.leetcode.solutions.s832;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution1() {
    int[][] input = new int[][] { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 }, };
    sol.flipAndInvertImage(input);
    int[][] expected = new int[][] { { 1, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 }, };
    assertArrayEquals(expected, input);
  }

  @Test
  public void testSolution2() {
    int[][] input = new int[][] { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 }, };
    sol.flipAndInvertImage(input);
    int[][] expected = new int[][] { { 1, 1, 0, 0 }, { 0, 1, 1, 0 }, { 0, 0, 0, 1 }, { 1, 0, 1, 0 }, };
    assertArrayEquals(expected, input);
  }
}
