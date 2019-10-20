package com.chifungcheung.leetcode.solutions.s30;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    List<Integer> ans = sol.findSubstring("barfoothefoobarman", new String[] { "foo", "bar" });
    assertThat(ans, is(Arrays.asList(0, 9)));
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    List<Integer> ans = sol.findSubstring("wordgoodgoodgoodbestword", new String[] { "word", "good", "best", "word" });
    assertThat(ans, is(new ArrayList<>()));
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    List<Integer> ans = sol.findSubstring("barfoofoobarthefoobarman", new String[] { "bar", "foo", "the" });
    assertThat(ans, is(Arrays.asList(6, 9, 12)));
  }

  @Test
  public void testSolution004() {
    Solution sol = new Solution();
    List<Integer> ans = sol.findSubstring("wordgoodgoodgoodbestword", new String[] { "word", "good", "best", "good" });
    assertThat(ans, is(Arrays.asList(8)));
  }
}
