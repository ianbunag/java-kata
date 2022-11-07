package dev.ianbunag.java_kata.codewars;

/**
 * Challenge solution.
 */
public class N13NotVerySecure {
  private N13NotVerySecure() { }

  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(log n)
    *  <li>Worst time complexity:   O(n)
    *  <li>Space complexity:        O(1)
    * </ul>
    *
    * @return challenge answer.
    */
  public static boolean alphanumeric(String string) {
    for (var index = 0; index < string.length(); index += 1) {
      var character = string.charAt(index);

      // Lowercase letter
      if (character >= 96 && character <= 122) {
        continue;
      }

      // Uppercase letter
      if (character >= 65 && character <= 90) {
        continue;
      }

      // Number
      if (character >= 48 && character <= 57) {
        continue;
      }

      return false;
    }

    return !string.isEmpty();
  }
}
