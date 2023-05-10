package dev.ianbunag.java_kata.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N36InsertIntervalTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N36InsertInterval();

    assertArrayEquals(
        new int[][]{{1, 2}, {3, 4}, {5, 6}},
        solution.insert(new int[][]{{1, 2}, {5, 6}}, new int[]{3, 4})
    );
    assertArrayEquals(
        new int[][]{{1, 2}, {3, 4}, {5, 6}},
        solution.insert(new int[][]{{3, 4}, {5, 6}}, new int[]{1, 2})
    );
    assertArrayEquals(
        new int[][]{{1, 2}, {3, 4}, {5, 6}},
        solution.insert(new int[][]{{1, 2}, {3, 4}}, new int[]{5, 6})
    );
    assertArrayEquals(
        new int[][]{{1, 5}, {6, 9}},
        solution.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5})
    );
    assertArrayEquals(
        new int[][]{{1, 2}, {3, 10}, {12, 16}},
        solution.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8})
    );
  }
}
