package dev.ianbunag.java_kata.leetcode;

/**
 * Challenge solution.
 */
public class N18SearchWordsDataStructure {
  private static char WILCARD_CHARACTER = '.';
  private static char OFFSET_CHARACTER = 'a';

  private N18SearchWordsDataStructure[] characters = new N18SearchWordsDataStructure[26];
  private boolean isWord = false;

  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n)
    *  <li>Worst time complexity:   O(n)
    *  <li>Space complexity:        O(n)
    * </ul>
    */
  public void addWord(String word) {
    if (word.equals("")) {
      this.isWord = true;

      return;
    }

    var currentCharacter = word.charAt(0);
    var nextWord = word.substring(1);

    if (this.get(currentCharacter) == null) {
      this.set(currentCharacter);
    }

    this.get(currentCharacter).addWord(nextWord);
  }

  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n)
    *  <li>Worst time complexity:   O(n)
    *  <li>Space complexity:        O(n)
    * </ul>
    *
    * <p>
    * Why is the worst time complexity not O(n^2)?
    * - Because the inner loop when wildcard matching is constant (26 letters)
    * </p>
    *
    * @return true if word is found.
    */
  public boolean search(String word) {
    if (word.equals("")) {
      return this.isWord == true;
    }

    var currentCharacter = word.charAt(0);
    var nextWord = word.substring(1);
    N18SearchWordsDataStructure[] searchList
      = currentCharacter == N18SearchWordsDataStructure.WILCARD_CHARACTER
        ? this.characters
        : new N18SearchWordsDataStructure[]{this.get(currentCharacter)};

    for (var character : searchList) {
      if (character != null && character.search(nextWord)) {
        return true;
      }
    }

    return false;
  }

  private N18SearchWordsDataStructure get(char character) {
    return this.characters[character - N18SearchWordsDataStructure.OFFSET_CHARACTER];
  }

  private void set(char character) {
    this.characters[character - N18SearchWordsDataStructure.OFFSET_CHARACTER]
      = new N18SearchWordsDataStructure();
  }
}
