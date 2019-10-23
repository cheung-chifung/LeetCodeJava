package com.chifungcheung.leetcode.solutions.s929;

import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=929 lang=java
 *
 * [929] Unique Email Addresses
 */

// @lc code=start
class Solution {
  public int numUniqueEmails(String[] emails) {
    Set<String> set = new HashSet<String>();
    int ans = 0;
    for (String s : emails) {
      String ns = this.normalize(s);
      if (!set.contains(ns)) {
        ans++;
        set.add(ns);
      }
    }
    return ans;
  }

  private String normalize(String v) {
    StringBuilder sb = new StringBuilder();
    boolean hasPlus = false;
    boolean hasAtMark = false;
    for (int i = 0; i < v.length(); i++) {
      char c = v.charAt(i);
      if (c == '+') {
        hasPlus = true;
      } else if (c == '.') {
        if (hasAtMark) {
          sb.append(c);
        }
      } else if (c == '@') {
        hasPlus = false;
        hasAtMark = true;
        sb.append(c);
      } else {
        if (!hasPlus) {
          sb.append(c);
        }
      }
    }
    return sb.toString();
  }
}
// @lc code=end
