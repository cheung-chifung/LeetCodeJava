package com.chifungcheung.leetcode.solutions.s139;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution() {
    Solution sol = new Solution();
    {
      ArrayList<String> workDict = new ArrayList<String>();
      workDict.add("leet");
      workDict.add("code");
      boolean ans = sol.wordBreak("leetcode", workDict);
      assertTrue(ans);
    }
    {
      ArrayList<String> workDict = new ArrayList<String>();
      workDict.add("apple");
      workDict.add("pen");
      boolean ans = sol.wordBreak("applepenapple", workDict);
      assertTrue(ans);
    }
    {
      ArrayList<String> workDict = new ArrayList<String>();
      workDict.add("cats");
      workDict.add("dog");
      workDict.add("sand");
      boolean ans = sol.wordBreak("catsandog", workDict);
      assertFalse(ans);
    }
  }
}
