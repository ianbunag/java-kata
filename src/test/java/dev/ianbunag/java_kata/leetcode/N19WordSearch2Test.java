package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.Test;

/**
 * Challenge tests.
 */
public class N19WordSearch2Test {
  @Test
  public void it_should_find_words() throws Exception {
    var solution = new N19WordSearch2();
    var board = new char[][]{
      {'o', 'a', 'a', 'n'},
      {'e', 't', 'a', 'e'},
      {'i', 'h', 'k', 'r'},
      {'i', 'f', 'l', 'v'},
    };
    var foundWords = solution.findWords(board, new String[]{"oath", "pea", "eat", "rain"});
    assertIterableEquals(Arrays.asList(new String[]{"oath", "eat"}), foundWords);
  }

  @Test
  public void todo_1() throws Exception {
    var solution = new N19WordSearch2();
    var board = new char[][]{{'a'}, {'a'}};
    var foundWords = solution.findWords(board, new String[]{"aaa"});
    assertIterableEquals(Arrays.asList(new String[]{}), foundWords);
  }

  @Test
  public void todo_2() throws Exception {
    var solution = new N19WordSearch2();
    var board = new char[][]{
      {'o', 'a', 'b', 'n'},
      {'o', 't', 'a', 'e'},
      {'a', 'h', 'k', 'r'},
      {'a', 'f', 'l', 'v'},
    };
    var foundWords = solution.findWords(board, new String[]{"oa", "oaa"});
    assertIterableEquals(Arrays.asList(new String[]{"oa", "oaa"}), foundWords);
  }
}
