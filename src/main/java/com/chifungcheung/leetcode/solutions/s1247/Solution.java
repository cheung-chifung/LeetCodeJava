package com.chifungcheung.leetcode.solutions.s1247;

class Solution {
  public int minimumSwap(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return -1;
    }
    int xyPair = 0;
    int yxPair = 0;
    for (int i = 0; i < s1.length(); i++) {
      char ch1 = s1.charAt(i);
      char ch2 = s2.charAt(i);
      if (ch1 == ch2) {
        continue;
      }
      if (ch1 == 'x' && ch2 == 'y') {
        xyPair++;
      } else if (ch2 == 'x' && ch1 == 'y') {
        yxPair++;
      }
    }
    int ans = 0;
    ans += xyPair / 2;
    ans += yxPair / 2;
    xyPair = xyPair % 2;
    yxPair = yxPair % 2;
    if (xyPair == yxPair) {
      ans += xyPair * 2;
      return ans;
    }
    return -1;
  }
}