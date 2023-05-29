package dev.ianbunag.java_kata.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N40SingleNumberTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N40SingleNumber();
    assertEquals(1, solution.singleNumber(new int[]{2, 2, 1}));
    assertEquals(4, solution.singleNumber(new int[]{4, 1, 2, 1, 2}));
    assertEquals(1, solution.singleNumber(new int[]{1}));
  }
}
