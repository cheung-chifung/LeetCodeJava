package com.chifungcheung.leetcode.solutions.s205;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start
class Solution {
  public boolean isIsomorphic(String s, String t) {
    int n = s.length();
    Map<Character, Character> d = new HashMap<>();
    Map<Character, Character> e = new HashMap<>();
    for (int i = 0; i < n; i++) {
      char sChar = s.charAt(i);
      char tChar = t.charAt(i);
      if (d.containsKey(sChar)) {
        if (d.get(sChar) != tChar) {
          return false;
        }
      } else {
        d.put(sChar, tChar);
      }
      if (e.containsKey(tChar)) {
        if (e.get(tChar) != sChar) {
          return false;
        }
      } else {
        e.put(tChar, sChar);
      }
    }
    return true;
  }
}
// @lc code=end
