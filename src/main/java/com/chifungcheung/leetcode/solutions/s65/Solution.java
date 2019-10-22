package com.chifungcheung.leetcode.solutions.s65;

/*
 * @lc app=leetcode id=65 lang=java
 *
 * [65] Valid Number
 */

// @lc code=start
class Solution {
  public boolean isNumber(String s) {
    s = s.trim();
    if (s.isEmpty()) {
      return false;
    }
    boolean started = false;
    boolean hasSign = false;
    boolean hasDecimalPoint = false;
    boolean hasDigitsBeforeDecimalPoint = false;
    boolean hasDigitsAfterDecimalPoint = false;
    boolean hasExponent = false;
    boolean hasDigitsBeforeExponent = false;
    boolean hasDigitsAfterExponent = false;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c >= '0' && c <= '9') {
        started = true;
        hasDigitsBeforeDecimalPoint = true;
        if (hasExponent) {
          hasDigitsAfterExponent = true;
        } else {
          hasDigitsBeforeExponent = true;
        }
        if (hasDecimalPoint) {
          hasDigitsAfterDecimalPoint = true;
        } else {
          hasDigitsBeforeDecimalPoint = true;
        }
      } else if (c == '-' || c == '+') {
        if (started || hasSign || hasDecimalPoint) {
          return false;
        }
        hasSign = true;
      } else if (c == 'e') {
        if (hasExponent) {
          return false;
        }
        hasExponent = true;
        hasSign = false;
        hasDecimalPoint = false;
        started = false;
      } else if (c == '.') {
        if (hasDecimalPoint || hasExponent) {
          return false;
        }
        hasDecimalPoint = true;
      } else {
        return false;
      }
    }
    if (hasExponent && (!hasDigitsAfterExponent || !hasDigitsBeforeExponent)) {
      return false;
    }
    if (hasDecimalPoint && !hasDigitsBeforeDecimalPoint && !hasDigitsAfterDecimalPoint) {
      return false;
    }
    return true;
  }
}
// @lc code=end
