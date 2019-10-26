package com.chifungcheung.leetcode.solutions.s149;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    int ans = sol.maxPoints(new int[][] {{1, 1}, {2, 2}, {3, 3}});
    assertEquals(3, ans);
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    int ans = sol.maxPoints(new int[][] {{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}});
    assertEquals(4, ans);
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    int ans = sol.maxPoints(new int[][] {{0, 0}, {1, 1}, {0, 0}});
    assertEquals(3, ans);
  }
}
