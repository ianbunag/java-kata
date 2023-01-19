package dev.ianbunag.java_kata.leetcode;

import java.util.HashMap;

/**
 * Challenge solution.
 */
public class N6LongestSubstringNoRepeating {
  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n)
    *  <li>Worst time complexity:   O(n)
    *  <li>Space complexity:        O(log n)
    * </ul>
    *
    * @return challenge answer.
    */
  public int lengthOfLongestSubstring(String string) {
    HashMap<Character, Integer> existingCharacters = new HashMap<>();
    int maxCount = 0;
    int leftPointer = 0;

    for (int rightPointer = 0; rightPointer <= string.length() - 1; rightPointer += 1) {
      var character = string.charAt(rightPointer);
      var existingCharacter = existingCharacters.getOrDefault(character, -1);

      existingCharacters.put(character, rightPointer);

      if (existingCharacter >= leftPointer) {
        leftPointer = existingCharacter + 1;
        continue;
      }

      maxCount = Math.max(maxCount, rightPointer - leftPointer + 1);
    }

    return maxCount;
  }
}
