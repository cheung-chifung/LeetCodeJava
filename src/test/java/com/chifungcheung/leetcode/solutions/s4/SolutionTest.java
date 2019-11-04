package com.chifungcheung.leetcode.solutions.s4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    double ans = sol.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 });
    assertEquals(2.0, ans, 0.00001);
  }

  @Test
  public void testSolution002() {
    double ans = sol.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 });
    assertEquals(2.5, ans, 0.00001);
  }

  @Test
  public void testSolution003() {
    double ans = sol.findMedianSortedArrays(new int[] { 7, 8, 15, 16, 20 }, new int[] { 1, 3, 5, 9 });
    assertEquals(8.0, ans, 0.00001);
  }
}
