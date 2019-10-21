package com.chifungcheung.leetcode.solutions.s120;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    List<List<Integer>> input = Arrays.asList(Arrays.asList(2), Arrays.asList(3, 4), Arrays.asList(6, 5, 7),
        Arrays.asList(4, 1, 8, 3));
    int ans = sol.minimumTotal(input);
    assertEquals(11, ans);
  }
}
