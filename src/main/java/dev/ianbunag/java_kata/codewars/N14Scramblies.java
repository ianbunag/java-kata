package dev.ianbunag.java_kata.codewars;

/**
 * Challenge solution.
 */
public class N14Scramblies {
  private N14Scramblies() { }

  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n log n)
    *  <li>Worst time complexity:   O(2n)
    *  <li>Space complexity:        O(1)
    * </ul>
    *
    * @return challenge answer.
    */
  public static boolean scramble(String source, String target) {
    var occurrences = new int[1 + 'z' - 'a'];

    for (int index = 0; index < source.length(); index++) {
      var sourceChar = (int) source.charAt(index);

      occurrences[sourceChar - 'a'] += 1;
    }

    for (int index = 0; index < target.length(); index++) {
      var targetChar = (int) target.charAt(index);

      if (--occurrences[targetChar - 'a'] < 0) {
        return false;
      }
    }

    return true;
  }
}
