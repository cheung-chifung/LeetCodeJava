package com.chifungcheung.leetcode.solutions.s299;

import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=299 lang=java
 *
 * [299] Bulls and Cows
 */

// @lc code=start
class Solution {
  public String getHint(String secret, String guess) {
    int[] m = new int[10];
    for (int i = 0; i < secret.length(); i++) {
      int d = secret.charAt(i) - '0';
      m[d]++;
    }
    int A = 0;
    int B = 0;
    Set<Integer> checked = new HashSet<>();
    for (int i = 0; i < guess.length(); i++) {
      char ch = guess.charAt(i);
      int d = guess.charAt(i) - '0';
      if (secret.charAt(i) == ch) {
        A++;
        m[d]--;
        checked.add(i);
      }
    }
    for (int i = 0; i < guess.length(); i++) {
      if (checked.contains(i)) {
        continue;
      }
      int d = guess.charAt(i) - '0';
      if (m[d] > 0) {
        B++;
        m[d]--;
      }
    }
    return String.valueOf(A) + "A" + String.valueOf(B) + "B";
  }
}
// @lc code=end
