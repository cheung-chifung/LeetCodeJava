package com.chifungcheung.leetcode.solutions.s68;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    List<String> ans = sol.fullJustify(new String[] { "This", "is", "an", "example", "of", "text", "justification." },
        16);
    assertArrayEquals(new String[] { "This    is    an", "example  of text", "justification.  " }, ans.toArray());
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    List<String> ans = sol.fullJustify(new String[] { "What", "must", "be", "acknowledgment", "shall", "be" }, 16);
    assertArrayEquals(new String[] { "What   must   be", "acknowledgment  ", "shall be        " }, ans.toArray());
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    List<String> ans = sol.fullJustify(new String[] { "Science", "is", "what", "we", "understand", "well", "enough",
        "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do" }, 20);
    assertArrayEquals(new String[] { "Science  is  what we", "understand      well", "enough to explain to",
        "a  computer.  Art is", "everything  else  we", "do                  " }, ans.toArray());
  }

  @Test
  public void testSolution004() {
    Solution sol = new Solution();
    List<String> ans = sol.fullJustify(new String[] { "Listen", "to", "many,", "speak", "to", "a", "few." }, 6);
    assertArrayEquals(new String[] { "Listen", "to    ", "many, ", "speak ", "to   a", "few.  " }, ans.toArray());
  }
}
