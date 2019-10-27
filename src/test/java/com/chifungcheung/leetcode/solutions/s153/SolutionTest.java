package com.chifungcheung.leetcode.solutions.s153;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    int ans = sol.findMin(new int[] {3, 4, 5, 1, 2});
    assertEquals(1, ans);
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    int ans = sol.findMin(new int[] {4, 5, 6, 7, 0, 1, 2});
    assertEquals(0, ans);
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    int ans = sol.findMin(new int[] {6, 7, 0, 1, 2, 3, 4, 5});
    assertEquals(0, ans);
  }

  @Test
  public void testSolution004() {
    Solution sol = new Solution();
    int ans = sol.findMin(new int[] {7, 6});
    assertEquals(6, ans);
  }

  @Test
  public void testSolution005() {
    Solution sol = new Solution();
    int ans = sol.findMin(new int[] {7});
    assertEquals(7, ans);
  }

  @Test
  public void testSolution006() {
    Solution sol = new Solution();
    int ans = sol.findMin(new int[] {2, 0, 1});
    assertEquals(0, ans);
  }
}
