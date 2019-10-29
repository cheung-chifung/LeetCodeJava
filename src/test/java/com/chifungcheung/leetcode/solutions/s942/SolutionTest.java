package com.chifungcheung.leetcode.solutions.s942;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    assertArrayEquals(new int[] { 0, 3, 2, 4, 1 }, sol.diStringMatch("IDID"));
  }

  @Test
  public void testSolution002() {
    assertArrayEquals(new int[] { 4, 1, 2, 0, 3 }, sol.diStringMatch("DIDI"));
  }

}
