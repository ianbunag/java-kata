package dev.ianbunag.java_kata.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Challenge solution.
 */
public class N19WordSearch2 {
  private static char VISITED_MARKER = '#';

  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(4^n)
    *  <li>Worst time complexity:   O(4^n)
    *  <li>Space complexity:        O(n)
    * </ul>
    *
    * @return challenge answer.
    */
  public List<String> findWords(char[][] board, String[] words) {
    var wordsFound = new HashSet<String>();
    var wordsTrie = N19Trie.from(words);

    for (var row = 0; row < board.length; row += 1) {
      for (var column = 0; column < board[row].length; column += 1) {
        this.findWordsFromPosition(board, row, column, wordsTrie, wordsFound, "");
      }
    }

    return new ArrayList<String>(wordsFound);
  }

  /**
    * Find word from position.
    * <ul>
    *  <li>Average time complexity: O(4^n)
    *  <li>Worst time complexity:   O(4^n)
    *  <li>Space complexity:        O(n)
    * </ul>
    */
  private void findWordsFromPosition(
      char[][] board,
      Integer row,
      Integer column,
      N19Trie wordsTrie,
      HashSet<String> wordsFound,
      String previousWord
  ) {
    if (
        row < 0
        || row >= board.length
        || column < 0
        || column >= board[row].length
    ) {
      return;
    }

    var character = board[row][column];

    if (!this.isVisited(character) && wordsTrie.has(character)) {
      var nextWordsTrie = wordsTrie.get(character);
      var currentWord = previousWord + character;
      var markUnvisited = this.markVisited(board, row, column);

      if (nextWordsTrie.isWord()) {
        wordsFound.add(currentWord);
      }

      this.findWordsFromPosition(board, row, column + 1, nextWordsTrie, wordsFound, currentWord);
      this.findWordsFromPosition(board, row + 1, column, nextWordsTrie, wordsFound, currentWord);
      this.findWordsFromPosition(board, row, column - 1, nextWordsTrie, wordsFound, currentWord);
      this.findWordsFromPosition(board, row - 1, column, nextWordsTrie, wordsFound, currentWord);
      markUnvisited.run();
    }
  }

  private boolean isVisited(char character) {
    return character == N19WordSearch2.VISITED_MARKER;
  }

  private Runnable markVisited(char[][] board, Integer row, Integer column) {
    var character = board[row][column];

    board[row][column] = N19WordSearch2.VISITED_MARKER;

    return () -> board[row][column] = character;
  }
}

class N19Trie {
  private static char CHARACTER_OFFSET = 'a';

  private N19Trie[] children = new N19Trie[26];
  private Boolean isWord = false;

  public void add(String word) {
    var current = this;

    for (var character : word.toCharArray()) {
      if (!current.has(character)) {
        current.set(character);
      }

      current = current.get(character);
    }

    current.isWord = true;
  }

  public boolean has(char character) {
    return this.children[character - N19Trie.CHARACTER_OFFSET] != null;
  }

  public N19Trie get(char character) {
    return this.children[character - N19Trie.CHARACTER_OFFSET];
  }

  public void set(char character) {
    this.children[character - N19Trie.CHARACTER_OFFSET] = new N19Trie();
  }

  public Boolean isWord() {
    return this.isWord;
  }

  public static N19Trie from(String... words) {
    var trie = new N19Trie();

    for (var word : words) {
      trie.add(word);
    }

    return trie;
  }
}