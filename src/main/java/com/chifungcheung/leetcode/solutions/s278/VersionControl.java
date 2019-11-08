package com.chifungcheung.leetcode.solutions.s278;

public class VersionControl {
  int currentVersion = 0;

  public void setCurrentVersion(int version) {
    this.currentVersion = version;
  }

  public boolean isBadVersion(int version) {
    return version <= this.currentVersion;
  }
}