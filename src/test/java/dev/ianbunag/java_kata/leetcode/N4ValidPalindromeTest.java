package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N4ValidPalindromeTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N4ValidPalindrome();

    assertEquals(false, solution.isPalindrome("0P"));
    assertEquals(false, solution.isPalindrome("race a car"));
    assertEquals(true, solution.isPalindrome("A man, a plan, a canal: Panama"));
    assertEquals(true, solution.isPalindrome(" "));
  }
}
