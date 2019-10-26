package com.chifungcheung.leetcode.solutions.s133;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.chifungcheung.leetcode.data.graph.Node;

/*
 * @lc app=leetcode id=133 lang=java
 *
 * [133] Clone Graph
 */

// @lc code=start
class Solution {
  public Node cloneGraph(Node node) {
    Map<Integer, Node> d = new HashMap<>();
    return clone(node, d);
  }

  private Node clone(Node node, Map<Integer, Node> d) {
    if (node == null) {
      return null;
    }
    if (d.containsKey(node.val)) {
      return d.get(node.val);
    }
    Node n = new Node();
    n.val = node.val;
    n.neighbors = new ArrayList<>();
    d.put(n.val, n);
    for (Node nn : node.neighbors) {
      n.neighbors.add(clone(nn, d));
    }
    return n;
  }
}
// @lc code=end
