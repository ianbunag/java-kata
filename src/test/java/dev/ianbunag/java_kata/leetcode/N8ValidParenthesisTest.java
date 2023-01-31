package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N8ValidParenthesisTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N8ValidParenthesis();

    assertEquals(false, solution.isValid("]"));
    assertEquals(false, solution.isValid("["));
    assertEquals(true, solution.isValid("()"));
    assertEquals(true, solution.isValid("()[]{}"));
    assertEquals(false, solution.isValid("(]"));
    assertEquals(false, solution.isValid("([)]"));
  }
}
