package dev.ianbunag.java_kata.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N1ContainsDuplicateTest {
  @Test
  public void testChallenge() throws Exception {
    var checker = new N1ContainsDuplicate();

    assertEquals(checker.containsDuplicate(new int[]{1, 2, 3, 1}), true);
    assertEquals(checker.containsDuplicate(new int[]{1, 2, 3, 4}), false);
    assertEquals(checker.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}), true);
  }
}
