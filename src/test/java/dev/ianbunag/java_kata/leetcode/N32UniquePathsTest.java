package dev.ianbunag.java_kata.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N32UniquePathsTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N32UniquePaths();
    assertEquals(28, solution.uniquePaths(3, 7));
    assertEquals(3, solution.uniquePaths(3, 2));
    assertEquals(28, solution.uniquePaths(7, 3));
  }
}
