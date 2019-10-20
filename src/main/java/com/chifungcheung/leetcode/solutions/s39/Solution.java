package com.chifungcheung.leetcode.solutions.s39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> outResult = new ArrayList<List<Integer>>();
    LinkedList<Integer> intermediate = new LinkedList<Integer>();
    Arrays.sort(candidates);
    dfs(candidates, target, outResult, 0, intermediate);
    return outResult;
  }

  private void dfs(int[] candidates, int target, List<List<Integer>> outResult, int start,
      LinkedList<Integer> intermediate) {
    if (target == 0) { // print
      outResult.add(new ArrayList<Integer>(intermediate));
    }
    for (int i = start; i < candidates.length; i++) { // depth-first search
      if (target < candidates[i]) { // cut
        return;
      }
      intermediate.addLast(candidates[i]);
      dfs(candidates, target - candidates[i], outResult, i, intermediate);
      intermediate.removeLast();
    }
  }
}