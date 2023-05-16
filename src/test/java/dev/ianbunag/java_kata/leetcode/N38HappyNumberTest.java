package dev.ianbunag.java_kata.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N38HappyNumberTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N38HappyNumber();

    assertEquals(true, solution.isHappy(10));
    assertEquals(true, solution.isHappy(19));
    assertEquals(true, solution.isHappy(1));
    assertEquals(false, solution.isHappy(2));
  }
}
