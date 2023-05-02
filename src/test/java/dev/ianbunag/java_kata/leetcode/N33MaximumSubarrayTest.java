package dev.ianbunag.java_kata.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N33MaximumSubarrayTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N33MaximumSubarray();
    assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    assertEquals(1, solution.maxSubArray(new int[]{1}));
    assertEquals(23, solution.maxSubArray(new int[]{5, 4, -1, 7, 8}));
  }
}
