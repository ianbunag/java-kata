package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N6LongestSubstringNoRepeatingTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N6LongestSubstringNoRepeating();
    assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    assertEquals(1, solution.lengthOfLongestSubstring(" "));
    assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
  }
}
