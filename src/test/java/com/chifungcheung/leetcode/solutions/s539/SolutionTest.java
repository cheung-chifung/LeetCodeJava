package com.chifungcheung.leetcode.solutions.s539;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    int ans = sol.findMinDifference(Arrays.asList("23:59", "00:00"));
    assertEquals(1, ans);
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    int ans = sol.findMinDifference(Arrays.asList("00:00", "23:59", "00:00"));
    assertEquals(0, ans);
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    int ans = sol.findMinDifference(Arrays.asList("05:31", "22:08", "00:35"));
    assertEquals(147, ans);
  }
}
