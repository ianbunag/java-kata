package dev.ianbunag.java_kata.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N37NonOverlappingIntervalsTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N37NonOverlappingIntervals();

    assertEquals(
        2,
        solution.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}})
    );
    assertEquals(
        1,
        solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}})
    );
    assertEquals(
        0,
        solution.eraseOverlapIntervals(new int[][]{{1, 2}})
    );
    assertEquals(
        0,
        solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}})
    );
  }
}
