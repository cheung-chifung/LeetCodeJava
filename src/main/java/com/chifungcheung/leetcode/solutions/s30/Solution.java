package com.chifungcheung.leetcode.solutions.s30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode id=30 lang=java
 *
 * [30] Substring with Concatenation of All Words
 */

// @lc code=start
class Solution {
  public List<Integer> findSubstring(String s, String[] words) {
    List<Integer> ans = new ArrayList<>();
    if (s.length() == 0 || words.length == 0) {
      return ans;
    }

    int wordLen = words[0].length();
    int n = words.length;
    HashMap<String, Integer> wordCount = new HashMap<>();
    for (int i = 0; i < words.length; i++) {
      int curCount = wordCount.getOrDefault(words[i], 0);
      wordCount.put(words[i], ++curCount);
    }

    for (int i = 0; i + wordLen * n <= s.length(); i++) {
      HashMap<String, Integer> currentCount = new HashMap<>();
      int count = 0;
      for (int j = i; j + wordLen <= i + wordLen * n; j += wordLen) {
        String word = s.substring(j, j + wordLen);
        if (!wordCount.containsKey(word)) {
          break;
        }
        int curCount = currentCount.getOrDefault(word, 0);
        if (curCount < wordCount.get(word)) {
          currentCount.put(word, ++curCount);
          count++;
        }
      }
      if (count == n) {
        ans.add(i);
      }
    }
    return ans;
  }
}
// @lc code=end
