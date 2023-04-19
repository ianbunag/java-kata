package dev.ianbunag.java_kata.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N29LongestPalindromicStringTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N29LongestPalindromicString();

    assertEquals("bab", solution.longestPalindrome("babad"));
    assertEquals("ababa", solution.longestPalindrome("ababa"));
    assertEquals("bb", solution.longestPalindrome("cbbd"));
  }
}
