package com.chifungcheung.leetcode.solutions.s937;

import java.util.Arrays;

/*
 * @lc app=leetcode id=937 lang=java
 *
 * [937] Reorder Data in Log Files
 */

// @lc code=start
class Solution {
  public String[] reorderLogFiles(String[] logs) {
    Arrays.sort(logs, Solution::compare);
    return logs;
  }

  private static int compare(String s1, String s2) {
    int idx1 = s1.indexOf(' ');
    int idx2 = s2.indexOf(' ');
    char f1 = s1.charAt(idx1 + 1);
    char f2 = s2.charAt(idx2 + 1);
    if (isLetter(f1) && isNumber(f2)) {
      return -1;
    }
    if (isNumber(f1) && isLetter(f2)) {
      return 1;
    }
    if (isNumber(f1) && isNumber(f2)) {
      return 0;
    }
    String sub1 = s1.substring(idx1 + 1, s1.length());
    String sub2 = s2.substring(idx2 + 1, s2.length());
    int res = sub1.compareTo(sub2);
    if (res != 0) {
      return res;
    }
    sub1 = s1.substring(0, idx1);
    sub2 = s2.substring(0, idx2);
    return sub1.compareTo(sub2);
  }

  private static boolean isNumber(final char ch) {
    return ch >= '0' && ch <= '9';
  }

  private static boolean isLetter(final char ch) {
    return ch >= 'a' && ch <= 'z';
  }
}
// @lc code=end
