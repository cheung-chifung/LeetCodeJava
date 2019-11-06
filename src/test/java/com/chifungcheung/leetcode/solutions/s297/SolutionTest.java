package com.chifungcheung.leetcode.solutions.s297;

import static org.junit.Assert.assertEquals;

import com.chifungcheung.leetcode.data.TreeNode;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Codec codec = new Codec();
    String str = "[1,2,3,null,null,4,5]";
    TreeNode node = codec.deserialize(str);
    String ans = codec.serialize(node);
    assertEquals(str, ans);
  }

  @Test
  public void testSolution002() {
    Codec codec = new Codec();
    String str = "[]";
    TreeNode node = codec.deserialize(str);
    String ans = codec.serialize(node);
    assertEquals(str, ans);
  }

  @Test
  public void testSolution003() {
    Codec codec = new Codec();
    String str = "[1,3,null,null,4]";
    TreeNode node = codec.deserialize(str);
    String ans = codec.serialize(node);
    assertEquals(str, ans);
  }

  @Test
  public void testSolution004() {
    Codec codec = new Codec();
    String str = "[5,2,3,null,null,2,4,3,1]";
    TreeNode node = codec.deserialize(str);
    String ans = codec.serialize(node);
    assertEquals(str, ans);
  }

  @Test
  public void testSolution005() {
    Codec codec = new Codec();
    String str = "[1,2,null,3,null,4,null,5]";
    TreeNode node = codec.deserialize(str);
    String ans = codec.serialize(node);
    assertEquals(str, ans);
  }
}
