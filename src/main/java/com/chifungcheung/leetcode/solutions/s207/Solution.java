package com.chifungcheung.leetcode.solutions.s207;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode id=207 lang=java
 *
 * [207] Course Schedule
 */

// @lc code=start
class Solution {
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    List<List<Integer>> neighbors = new LinkedList<>();
    Queue<Integer> queue = new LinkedList<>();
    int[] indegree = new int[numCourses];

    for (int i = 0; i < numCourses; i++) {
      neighbors.add(new LinkedList<Integer>());
    }
    for (int[] pair : prerequisites) {
      neighbors.get(pair[1]).add(pair[0]);
      indegree[pair[0]]++;
    }
    int count = 0;
    for (int i = 0; i < numCourses; i++) {
      if (indegree[i] == 0) {
        queue.offer(i);
      }
    }
    while (!queue.isEmpty()) {
      int node = queue.poll();
      count++;
      for (int nb : neighbors.get(node)) {
        if (--indegree[nb] == 0) {
          queue.offer(nb);
        }
      }
    }
    return count == numCourses;
  }
}
// @lc code=end
