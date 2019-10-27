package com.chifungcheung.leetcode.solutions.s290;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */

// @lc code=start
class Solution {
  public boolean wordPattern(String pattern, String str) {
    List<String> words = Arrays.asList(str.split("\\s+"));
    Map<Character, String> d = new HashMap<>();
    Map<String, Character> e = new HashMap<>();
    if (pattern.length() != words.size()) {
      return false;
    }
    for (int i = 0; i < pattern.length(); i++) {
      char patChar = pattern.charAt(i);
      String word = words.get(i);
      if (d.containsKey(patChar)) {
        if (!d.get(patChar).equals(word)) {
          return false;
        }
      } else {
        d.put(patChar, word);
      }
      if (e.containsKey(word)) {
        if (e.get(word) != patChar) {
          return false;
        }
      } else {
        e.put(word, patChar);
      }
    }
    return true;
  }
}
// @lc code=end
