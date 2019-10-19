package com.chifungcheung.leetcode.solutions.s1;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution() {
    Solution sol = new Solution();
    int[] ans = sol.twoSum(new int[] { 2, 7, 11, 15 }, 9);
    System.out.println(ans);

    assertArrayEquals(new int[] { 0, 1 }, sol.twoSum(new int[] { 2, 7, 11, 15 }, 9));
  }
}
