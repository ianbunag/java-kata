package dev.ianbunag.java_kata.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N20StripCommentsTest {
  @Test
  public void testChallenge() throws Exception {
    assertEquals(
        "apples, pears\ngrapes\nbananas",
        N20StripComments.stripComments(
          "apples, pears # and bananas\ngrapes\nbananas !apples",
          new String[] { "#", "!" }
        )
    );
    assertEquals(
        "a\nc\nd",
        N20StripComments.stripComments("a #b\nc\nd $e f g", new String[] { "#", "$" })
    );

  }
}
