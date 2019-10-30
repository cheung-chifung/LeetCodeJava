package com.chifungcheung.leetcode.solutions.s858;

/*
 * @lc app=leetcode id=858 lang=java
 *
 * [858] Mirror Reflection
 */

// @lc code=start
class Solution {
  public int mirrorReflection(int p, int q) {
    int gcd = findGCD(p, q);
    return (p / gcd - 1) % 2 + (q / gcd) % 2;
  }

  private int findGCD(int a, int b) {
    if (b == 0) {
      return a;
    }
    return findGCD(b, a % b);
  }
}
// @lc code=end
