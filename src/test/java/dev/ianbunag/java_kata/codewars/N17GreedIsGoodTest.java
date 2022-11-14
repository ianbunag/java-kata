package dev.ianbunag.java_kata.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N17GreedIsGoodTest {
  @Test
  public void testChallenge() throws Exception {
    assertEquals(
        "Score for [1,1,1,3,1] must be 1100:",
        1100,
        N17GreedIsGood.greedy(new int[]{1, 1, 1, 3, 1})
    );
    assertEquals(
        "Score for [5,1,3,4,1] must be 250:",
        250,
        N17GreedIsGood.greedy(new int[]{5, 1, 3, 4, 1})
    );
    assertEquals(
        "Score for [2,4,4,5,4] must be 450:",
        450,
        N17GreedIsGood.greedy(new int[]{2, 4, 4, 5, 4})
    );
  }
}
