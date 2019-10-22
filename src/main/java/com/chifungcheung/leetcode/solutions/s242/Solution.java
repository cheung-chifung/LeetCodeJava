package com.chifungcheung.leetcode.solutions.s242;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    Map<Character, Integer> d = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      int acc = d.getOrDefault(c, 0);
      d.put(c, ++acc);
    }

    for (int i = 0; i < t.length(); i++) {
      char c = t.charAt(i);
      int v = d.getOrDefault(c, 0);
      if (v == 0) {
        return false;
      }
      v--;
      if (v == 0) {
        d.remove(c);
      } else {
        d.put(c, v);
      }
    }
    return d.isEmpty();
  }
}
// @lc code=end
