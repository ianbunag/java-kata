package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N9SearchInRotatedSortedArrayTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N9SearchInRotatedSortedArray();

    assertEquals(0, solution.search(new int[]{4, 5, 6, 7, 0, 1}, 4));
    assertEquals(1, solution.search(new int[]{4, 5, 6, 7, 0, 1}, 5));
    assertEquals(3, solution.search(new int[]{4, 5, 6, 7, 0, 1}, 7));
    assertEquals(4, solution.search(new int[]{4, 5, 6, 7, 0, 1}, 0));
    assertEquals(5, solution.search(new int[]{4, 5, 6, 7, 0, 1}, 1));
    assertEquals(-1, solution.search(new int[]{4, 5, 6, 7, 0, 1}, 3));

    assertEquals(6, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 2));
    assertEquals(4, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    assertEquals(5, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 1));
    assertEquals(0, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 4));
    assertEquals(1, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 5));
    assertEquals(2, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 6));
    assertEquals(3, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 7));
    assertEquals(-1, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));

    assertEquals(-1, solution.search(new int[]{1}, 0));
  }
}
