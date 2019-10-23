package com.chifungcheung.leetcode.solutions.s929;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    int ans = sol.numUniqueEmails(new String[] { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
        "testemail+david@lee.tcode.com" });
    assertEquals(2, ans);
  }
}
