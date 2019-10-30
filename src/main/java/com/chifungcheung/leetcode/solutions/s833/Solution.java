package com.chifungcheung.leetcode.solutions.s833;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=833 lang=java
 *
 * [833] Find And Replace in String
 */

// @lc code=start
class Solution {
  class Item {
    String source;
    String target;

    Item(String source, String target) {
      this.source = source;
      this.target = target;
    }
  }

  public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
    StringBuilder sb = new StringBuilder();
    // Index -> Item
    Map<Integer, Item> items = new HashMap<>();
    int SLen = S.length();
    for (int i = 0; i < indexes.length; i++) {
      items.put(indexes[i], new Item(sources[i], targets[i]));
    }
    for (int i = 0; i < SLen; i++) {
      char ch = S.charAt(i);
      if (items.containsKey(i)) {
        Item item = items.get(i);
        int srcLen = item.source.length();
        if (i + srcLen <= SLen && S.substring(i, i + srcLen).equals(item.source)) {
          sb.append(item.target);
          i += (srcLen - 1);
        } else {
          sb.append(ch);
        }
      } else {
        sb.append(ch);
      }
    }

    return sb.toString();
  }
}
// @lc code=end
