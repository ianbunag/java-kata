package dev.ianbunag.java_kata.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N30CoinChangeTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N30CoinChange();

    assertEquals(3, solution.coinChange(new int[]{1, 2, 5}, 11));
    assertEquals(4, solution.coinChange(new int[]{2, 5, 10, 1}, 27));
    assertEquals(20, solution.coinChange(new int[]{186, 419, 83, 408}, 6249));
    assertEquals(3, solution.coinChange(new int[]{2, 5}, 6));
    assertEquals(-1, solution.coinChange(new int[]{2}, 3));
    assertEquals(0, solution.coinChange(new int[]{1}, 0));
  }
}
