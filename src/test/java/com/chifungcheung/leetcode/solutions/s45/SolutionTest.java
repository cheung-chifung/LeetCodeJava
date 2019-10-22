package com.chifungcheung.leetcode.solutions.s45;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    // The minimum number of jumps to reach the last index is 2. Jump 1 step from
    // index 0 to 1, then 3 steps to the last index.
    int ans = sol.jump(new int[] { 2, 3, 1, 1, 4 });
    assertEquals(2, ans);
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    int ans = sol.jump(new int[] { 2, 3, 0, 1, 4 });
    assertEquals(2, ans);
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    assertEquals(0, sol.jump(new int[] { 0 }));
    assertEquals(0, sol.jump(new int[] { 1 }));
  }

  @Test
  public void testSolution004() {
    Solution sol = new Solution();
    assertEquals(3, sol.jump(new int[] { 5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0 }));
  }
}
