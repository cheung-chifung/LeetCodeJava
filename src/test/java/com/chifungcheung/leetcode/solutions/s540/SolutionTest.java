package com.chifungcheung.leetcode.solutions.s540;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    int ans = sol.singleNonDuplicate(new int[] { 1, 1, 2, 3, 3, 4, 4, 8, 8 });
    assertEquals(2, ans);
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    int ans = sol.singleNonDuplicate(new int[] { 3, 3, 7, 7, 10, 11, 11 });
    assertEquals(10, ans);
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    int ans = sol.singleNonDuplicate(new int[] { 3 });
    assertEquals(3, ans);
  }

  @Test
  public void testSolution004() {
    Solution sol = new Solution();
    int ans = sol.singleNonDuplicate(new int[] { 1, 1, 3 });
    assertEquals(3, ans);
  }
}
