package com.chifungcheung.leetcode.solutions.s44;

/*
 * @lc app=leetcode id=44 lang=java
 *
 * [44] Wildcard Matching
 */

// @lc code=start
class Solution {
  public boolean isMatch(String s, String p) {
    int si = 0, pi = 0, starIdx = -1, matchIdx = 0;
    while (si < s.length()) {
      if (pi < p.length() && (p.charAt(pi) == '?' || p.charAt(pi) == s.charAt(si))) {
        si++;
        pi++;
      } else if (pi < p.length() && p.charAt(pi) == '*') {
        starIdx = pi;
        matchIdx = si;
        pi++;
      } else if (starIdx != -1) {
        pi = starIdx + 1;
        matchIdx++;
        si = matchIdx;
      } else {
        return false;
      }
    }
    while (pi < p.length() && p.charAt(pi) == '*') {
      pi++;
    }
    return pi == p.length();
  }
}
// @lc code=end
