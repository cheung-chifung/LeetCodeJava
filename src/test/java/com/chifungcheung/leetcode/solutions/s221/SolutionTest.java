package com.chifungcheung.leetcode.solutions.s221;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    char[][] matrix = new char[][] { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' },
        { '1', '1', '1', '1', '1' }, { '1', '0', '0', '1', '0' } };
    assertEquals(4, sol.maximalSquare(matrix));
  }

  @Test
  public void testSolution002() {
    char[][] matrix = new char[][] { { '1' } };
    assertEquals(1, sol.maximalSquare(matrix));
  }

  @Test
  public void testSolution003() {
    char[][] matrix = new char[][] { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' },
        { '1', '1', '1', '1', '1' }, { '1', '0', '0', '1', '0' } };
    assertEquals(4, sol.maximalSquare(matrix));
  }
}
