package com.chifungcheung.leetcode.solutions.s151;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
class Solution {
  public String reverseWords(String s) {
    List<String> l = Arrays.asList(s.trim().split("\\s+"));
    Collections.reverse(l);
    return String.join(" ", l);
  }
}
// @lc code=end

