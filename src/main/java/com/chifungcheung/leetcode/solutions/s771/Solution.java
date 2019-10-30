package com.chifungcheung.leetcode.solutions.s771;

import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=771 lang=java
 *
 * [771] Jewels and Stones
 */

// @lc code=start
class Solution {
  public int numJewelsInStones(String J, String S) {
    Set<Character> js = new HashSet<>();
    for (int i = 0; i < J.length(); i++) {
      js.add(J.charAt(i));
    }
    int ans = 0;
    for (int i = 0; i < S.length(); i++) {
      if (js.contains(S.charAt(i))) {
        ans++;
      }
    }
    return ans;
  }
}
// @lc code=end
