package com.chifungcheung.leetcode.solutions.s51;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    List<List<String>> ans = sol.solveNQueens(4);
    assertEquals(2, ans.size());
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    List<List<String>> ans = sol.solveNQueens(6);
    assertEquals(4, ans.size());
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    List<List<String>> ans = sol.solveNQueens(8);
    assertEquals(92, ans.size());
  }
}
