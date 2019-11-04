package com.chifungcheung.leetcode.solutions.s383;

/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    int[] counter = new int[128];
    for (char ch : magazine.toCharArray()) {
      counter[ch]++;
    }
    for (char ch : ransomNote.toCharArray()) {
      if (--counter[ch] < 0) {
        return false;
      }
    }
    return true;
  }
}
// @lc code=end
