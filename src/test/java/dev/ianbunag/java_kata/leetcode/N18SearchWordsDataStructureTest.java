package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N18SearchWordsDataStructureTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N18SearchWordsDataStructure();
    solution.addWord("bad");
    solution.addWord("dad");
    solution.addWord("mad");
    assertEquals(false, solution.search("pad"));
    assertEquals(true, solution.search("bad"));
    assertEquals(true, solution.search(".ad"));
    assertEquals(true, solution.search("b.."));
    assertEquals(true, solution.search(".a."));
    assertEquals(true, solution.search("..d"));
    assertEquals(true, solution.search("d.."));
    assertEquals(true, solution.search("m.."));
    assertEquals(true, solution.search("..."));
    assertEquals(false, solution.search("x.."));
    assertEquals(false, solution.search(".x."));
    assertEquals(false, solution.search("..x"));
    assertEquals(false, solution.search("xad"));
    assertEquals(false, solution.search("bxd"));
    assertEquals(false, solution.search("bax"));
  }
}
