package com.chifungcheung.leetcode.solutions.s403;

/*
 * @lc app=leetcode id=403 lang=java
 *
 * [403] Frog Jump
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// @lc code=start
class Solution {
  public boolean canCross(int[] stones) {
    if (stones[1] != 1) {
      return false;
    }
    // x = i-th stones, start from 0
    // k = can be reach from i-th stone within k jump units
    List<Set<Integer>> d = new ArrayList<>();
    // stone position -> index
    Map<Integer, Integer> m = new HashMap<>();
    for (int i = 0; i < stones.length; i++) {
      d.add(new HashSet<>());
    }
    for (int i = 0; i < stones.length; i++) {
      m.put(stones[i], i);
    }
    d.get(1).add(1);
    for (int i = 1; i < stones.length; i++) {
      Set<Integer> last = d.get(i);

      for (Integer k : last) {
        for (int nk = k - 1; nk <= k + 1; nk++) {
          if (nk != 0) {
            int ns = stones[i] + nk;
            int ni = m.getOrDefault(ns, -1);
            if (ni > i && i < stones.length) {
              d.get(ni).add(nk);
            }
          }
        }
      }
    }
    return !d.get(stones.length - 1).isEmpty();
  }
}
// @lc code=end
