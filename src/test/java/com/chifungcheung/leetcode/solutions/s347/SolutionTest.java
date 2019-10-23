package com.chifungcheung.leetcode.solutions.s347;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    assertEquals(Arrays.asList(1, 2), sol.topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2));
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    assertEquals(Arrays.asList(1), sol.topKFrequent(new int[] { 1 }, 1));
  }
}
