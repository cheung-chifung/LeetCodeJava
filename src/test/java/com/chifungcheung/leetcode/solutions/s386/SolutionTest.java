package com.chifungcheung.leetcode.solutions.s386;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    List<Integer> ans = sol.lexicalOrder(13);
    assertArrayEquals(new int[] { 1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9 },
        ans.stream().mapToInt(Integer::intValue).toArray());
  }
}
