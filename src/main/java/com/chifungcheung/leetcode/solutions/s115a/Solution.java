package com.chifungcheung.leetcode.solutions.s115a;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=115 lang=java
 *
 * [115] Distinct Subsequences
 */

// @lc code=start
class Solution {
  public int numDistinct(String s, String t) {
    if (s.length() < t.length()) {
      return 0;
    }
    if (s.length() == t.length() && s.equals(t)) {
      return 1;
    }

    Map<Character, List<Integer>> d = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (d.containsKey(ch)) {
        List<Integer> level = d.get(ch);
        level.add(i);
      } else {
        List<Integer> level = new LinkedList<>();
        level.add(i);
        d.put(ch, level);
      }
    }

    return subNumDistinct(s, t, 0, -1, d);
  }

  private int subNumDistinct(String s, String t, int index, int lowest, Map<Character, List<Integer>> d) {
    if (index >= t.length()) {
      return 1;
    }
    char ch = t.charAt(index);
    if (!d.containsKey(ch)) {
      return 0;
    }
    int ans = 0;
    List<Integer> l = d.get(ch);
    int i = findLowerBound(l, lowest);
    while (i < l.size() && l.get(i) >= lowest) {
      ans += subNumDistinct(s, t, index + 1, l.get(i) + 1, d);
      i++;
    }

    return ans;
  }

  private int findLowerBound(List<Integer> range, int target) {
    int l = 0, r = range.size() - 1;
    while (l < r) {
      int m = l + (r - l) / 2;
      if (range.get(m) < target) {
        l = m + 1;
      } else {
        r = m;
      }
    }
    return l;
  }
}
// @lc code=end
