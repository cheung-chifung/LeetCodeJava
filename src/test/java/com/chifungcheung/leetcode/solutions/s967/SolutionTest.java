package com.chifungcheung.leetcode.solutions.s967;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    int[] ans = sol.numsSameConsecDiff(3, 7);
    Arrays.sort(ans);
    assertArrayEquals(new int[] { 181, 292, 707, 818, 929 }, ans);
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    int[] ans = sol.numsSameConsecDiff(2, 1);
    Arrays.sort(ans);
    assertArrayEquals(new int[] { 10, 12, 21, 23, 32, 34, 43, 45, 54, 56, 65, 67, 76, 78, 87, 89, 98 }, ans);
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    int[] ans = sol.numsSameConsecDiff(1, 0);
    Arrays.sort(ans);
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, ans);
  }

  @Test
  public void testSolution004() {
    Solution sol = new Solution();
    int[] ans = sol.numsSameConsecDiff(2, 0);
    Arrays.sort(ans);
    assertArrayEquals(new int[] { 11, 22, 33, 44, 55, 66, 77, 88, 99 }, ans);
  }
}
