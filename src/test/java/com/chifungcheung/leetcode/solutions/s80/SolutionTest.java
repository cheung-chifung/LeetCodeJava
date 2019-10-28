package com.chifungcheung.leetcode.solutions.s80;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    int[] input = new int[] { 1, 1, 1, 2, 2, 3 };
    int ans = sol.removeDuplicates(input);
    assertEquals(5, ans);
    assertArrayEquals(new int[] { 1, 1, 2, 2, 3 }, Arrays.copyOfRange(input, 0, 5));
  }

  @Test
  public void testSolution002() {
    int[] input = new int[] { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
    int ans = sol.removeDuplicates(input);
    assertEquals(7, ans);
    assertArrayEquals(new int[] { 0, 0, 1, 1, 2, 3, 3 }, Arrays.copyOfRange(input, 0, 7));
  }

  @Test
  public void testSolution003() {
    int[] input = new int[] { 0, 0, 0 };
    int ans = sol.removeDuplicates(input);
    assertEquals(2, ans);
    assertArrayEquals(new int[] { 0, 0 }, Arrays.copyOfRange(input, 0, 2));
  }
}
