package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N7LongestRepeatingCharacterReplacementTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N7LongestRepeatingCharacterReplacement();
    assertEquals(4, solution.characterReplacement("ABABBA", 1));
    assertEquals(4, solution.characterReplacement("ABAB", 2));
    assertEquals(4, solution.characterReplacement("AABABBA", 1));
  }
}
