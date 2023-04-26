package dev.ianbunag.java_kata.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

/**
 * Challenge tests.
 */
public class N31WordBreakTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N31WordBreak();

    assertEquals(
        true,
        solution.wordBreak("aaaaaaa", Arrays.asList(new String[]{"aaaa", "aaa"}))
    );
    assertEquals(
        false,
        solution.wordBreak("aaaaaaa", Arrays.asList(new String[]{"aaaa", "aa"}))
    );
    assertEquals(
        true,
        solution.wordBreak("leetcode", Arrays.asList(new String[]{"leet", "code"}))
    );
    assertEquals(
        true,
        solution.wordBreak("bb", Arrays.asList(new String[]{"a", "b", "bbb", "bbbb"}))
    );
    assertEquals(
        true,
        solution.wordBreak("applepenapple", Arrays.asList(new String[]{"apple", "pen"}))
    );
    assertEquals(
        false,
        solution.wordBreak(
          "catsandog",
          Arrays.asList(new String[]{"cats", "dog", "sand", "and", "cat"})
        )
    );
    assertEquals(
        true,
        solution.wordBreak(
          "catsanddogcat",
          Arrays.asList(new String[]{"cats", "dog", "and", "cat"})
        )
    );
    assertEquals(
        false,
        solution.wordBreak(
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
          Arrays.asList(new String[]{"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa" })
        )
    );
  }
}
