package com.chifungcheung.leetcode.solutions.s133;

import java.util.ArrayList;

import com.chifungcheung.leetcode.data.graph.Node;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution() {
    Solution sol = new Solution();
    Node n1 = new Node();
    n1.val = 1;
    n1.neighbors = new ArrayList<>();
    Node n2 = new Node();
    n2.val = 2;
    n2.neighbors = new ArrayList<>();
    Node n3 = new Node();
    n3.val = 3;
    n2.neighbors = new ArrayList<>();
    Node n4 = new Node();
    n4.val = 4;
    n4.neighbors = new ArrayList<>();

    n1.neighbors.add(n2);
    n1.neighbors.add(n3);
    n2.neighbors.add(n1);
    n2.neighbors.add(n4);
    n3.neighbors.add(n1);
    n3.neighbors.add(n4);
    n4.neighbors.add(n3);
    n4.neighbors.add(n2);
    sol.cloneGraph(n1);
  }
}
