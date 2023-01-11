package dev.ianbunag.java_kata.leetcode;

import java.util.stream.Collectors;

/**
 * Challenge solution.
 */
public class N4ValidPalindrome {
  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n)
    *  <li>Worst time complexity:   O(n)
    *  <li>Space complexity:        O(n)
    * </ul>
    *
    * @return challenge answer.
    */
  public boolean isPalindrome(String string) {
    var chars = string.chars()
        .filter(Character::isLetterOrDigit)
        .mapToObj((value) -> (char) value)
        .map(Character::toLowerCase)
        .collect(Collectors.toList());
    var length = chars.size();
    var halfLength = chars.size() / 2;

    for (int index = 0; index < halfLength; index += 1) {
      if (chars.get(index) != chars.get(length - index - 1)) {
        return false;
      }
    }

    return true;
  }
}
