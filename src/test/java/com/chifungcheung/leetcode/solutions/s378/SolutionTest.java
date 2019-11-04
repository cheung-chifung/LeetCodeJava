package com.chifungcheung.leetcode.solutions.s378;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    int[][] matrix = new int[][] { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 }, };
    int ans = sol.kthSmallest(matrix, 8);
    assertEquals(13, ans);
  }

  @Test
  public void testSolution002() {
    int[][] matrix = new int[][] { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 }, };
    int ans = sol.kthSmallest(matrix, 6);
    assertEquals(12, ans);
  }

  @Test
  public void testSolution003() {
    int[][] matrix = new int[][] { { 1, 2 }, { 1, 3 }, };
    int ans = sol.kthSmallest(matrix, 2);
    assertEquals(1, ans);
  }

  @Test
  public void testSolution004() {
    int[][] matrix = new int[][] { { 1, 3, 5 }, { 6, 7, 12 }, { 11, 14, 14 } };
    int ans = sol.kthSmallest(matrix, 2);
    assertEquals(3, ans);
  }
}
