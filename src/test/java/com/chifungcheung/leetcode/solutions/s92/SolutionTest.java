package com.chifungcheung.leetcode.solutions.s92;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.chifungcheung.leetcode.data.ListNode;
import com.chifungcheung.leetcode.data.ListNodeAssert;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    ListNode node = ListNode.fromArray(new int[] { 1, 2, 3, 4, 5 });
    node = sol.reverseBetween(node, 2, 4);
    ListNodeAssert.assertListNodeEquals(new int[] { 1, 4, 3, 2, 5 }, node);
  }
}
