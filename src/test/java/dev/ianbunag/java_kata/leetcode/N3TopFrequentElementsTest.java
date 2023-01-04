package dev.ianbunag.java_kata.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N3TopFrequentElementsTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N3TopFrequentElements();

    assertArrayEquals(solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2), new int[]{1, 2});
    assertArrayEquals(solution.topKFrequent(new int[]{1}, 1), new int[]{1});
  }
}
