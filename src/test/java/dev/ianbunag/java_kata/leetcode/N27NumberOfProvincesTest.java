package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N27NumberOfProvincesTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N27NumberOfProvinces();

    var connected = new int[][]{
      {1, 1, 0},
      {1, 1, 0},
      {0, 0, 1},
    };
    assertEquals(2, solution.findCircleNum(connected));

    var disconnected = new int[][]{
      {1, 0, 0},
      {0, 1, 0},
      {0, 0, 1},
    };
    assertEquals(3, solution.findCircleNum(disconnected));
  }
}
