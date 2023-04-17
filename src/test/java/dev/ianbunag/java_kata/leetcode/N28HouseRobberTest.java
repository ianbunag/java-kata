package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N28HouseRobberTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N28HouseRobber();

    assertEquals(4, solution.rob(new int[]{1, 2, 3, 1}));
    assertEquals(12, solution.rob(new int[]{2, 7, 9, 3, 1}));
    assertEquals(16, solution.rob(new int[]{10, 8, 2, 0, 1, 4}));
  }
}
