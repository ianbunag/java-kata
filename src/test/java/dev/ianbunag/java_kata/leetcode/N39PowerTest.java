package dev.ianbunag.java_kata.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N39PowerTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N39Power();

    assertEquals(0.00000, solution.myPow(2.00000, -2147483648), 0.00001);
    assertEquals(1.00000, solution.myPow(2.00000, 0), 0.00001);
    assertEquals(2.00000, solution.myPow(2.00000, 1), 0.00001);
    assertEquals(4.00000, solution.myPow(2.00000, 2), 0.00001);
    assertEquals(8.00000, solution.myPow(2.00000, 3), 0.00001);
    assertEquals(16.00000, solution.myPow(2.00000, 4), 0.00001);
    assertEquals(32.00000, solution.myPow(2.00000, 5), 0.00001);
    assertEquals(1024.00000, solution.myPow(2.00000, 10), 0.00001);
    assertEquals(9.26100, solution.myPow(2.10000, 3), 0.00001);
    assertEquals(0.25000, solution.myPow(2.00000, -2), 0.00001);
    assertEquals(0.00000, solution.myPow(2.00000, -2147483648), 0.00001);
  }
}
