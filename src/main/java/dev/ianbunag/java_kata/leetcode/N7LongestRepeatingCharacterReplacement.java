package dev.ianbunag.java_kata.leetcode;

/**
 * Challenge solution.
 */
public class N7LongestRepeatingCharacterReplacement {
  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n)
    *  <li>Worst time complexity:   O(n)
    *  <li>Space complexity:        O(1)
    * </ul>
    *
    * @return challenge answer.
    */
  public int characterReplacement(String string, int limit) {
    var occurrences = new int[26];
    var maxOccurrence = 0;
    var leftPointer = 0;
    var longestWindow = 0;

    for (var rightPointer = 0; rightPointer < string.length(); rightPointer += 1) {
      var rightCharacter = string.charAt(rightPointer);
      var rightOccurrence = occurrences[rightCharacter - 'A'] += 1;
      maxOccurrence = Math.max(maxOccurrence, rightOccurrence);

      while ((rightPointer  - leftPointer + 1) - maxOccurrence > limit) {
        var leftCharacter  = string.charAt(leftPointer);

        occurrences[leftCharacter - 'A'] -= 1;
        leftPointer += 1;
      }

      longestWindow = Math.max(longestWindow, rightPointer  - leftPointer + 1);
    }

    return longestWindow;
  }
}
