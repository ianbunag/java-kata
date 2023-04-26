package dev.ianbunag.java_kata.leetcode;

import java.util.List;

/**
 * Challenge solution.
 */
public class N31WordBreak {
  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n ^ 2)
    *  <li>Worst time complexity:   O(n ^ 2)
    *  <li>Space complexity:        O(n)
    * </ul>
    *
    * @return challenge answer.
    */
  public boolean wordBreak(String string, List<String> wordDict) {
    final boolean[] results = new boolean[string.length() + 1];
    results[string.length()] = true;
    final var trie = Trie.from(wordDict);

    for (var index = string.length() - 1; index >= 0; index -= 1) {
      var lookupIndex = index;
      var lookupTrie = trie;

      while (
          lookupIndex < string.length()
          && !results[index]
          && lookupTrie != null
      ) {
        lookupTrie = lookupTrie.get(string.charAt(lookupIndex));
        results[index] = lookupTrie != null && lookupTrie.isWord && results[lookupIndex + 1];
        lookupIndex += 1;
      }
    }

    return results[0];
  }
}

class Trie {
  private static char CHARACTER_OFFSET = 'a';
  private Trie[] children = new Trie[26];
  public boolean isWord = false;

  public void add(String word) {
    var trie = this;

    for (char character : word.toCharArray()) {
      if (trie.get(character) == null) {
        trie.set(character);
      }

      trie = trie.get(character);
    }

    trie.isWord = true;
  }

  public Trie get(char character) {
    return children[character - Trie.CHARACTER_OFFSET];
  }

  public Trie set(char character) {
    return children[character - Trie.CHARACTER_OFFSET] = new Trie();
  }

  public static Trie from(List<String> words) {
    final var trie = new Trie();

    for (final var word : words) {
      trie.add(word);
    }

    return trie;
  }
}