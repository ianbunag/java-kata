package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N20ClimbingStairsTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N20ClimbingStairs();

    assertEquals(2, solution.climbStairs(2));
    assertEquals(3, solution.climbStairs(3));
    assertEquals(5, solution.climbStairs(4));
  }
}
