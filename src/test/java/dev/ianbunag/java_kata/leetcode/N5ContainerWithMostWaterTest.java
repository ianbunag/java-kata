package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N5ContainerWithMostWaterTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N5ContainerWithMostWater();
    assertEquals(49, solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    assertEquals(1, solution.maxArea(new int[]{1, 1}));
  }
}
