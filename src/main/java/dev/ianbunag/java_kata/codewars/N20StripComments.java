package dev.ianbunag.java_kata.codewars;

/**
 * Challenge solution.
 */
public class N20StripComments {
  private N20StripComments() { }

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
  public static String stripComments(String text, String[] commentSymbols) {
    var strippedText = new StringBuilder();
    var strippedLine = new StringBuilder();
    var stripping = false;

    Runnable commitLine = () -> {
      strippedText.append(strippedLine.toString().stripTrailing());
      strippedLine.setLength(0);
    };

    for (char character : text.toCharArray()) {
      if (N20StripComments.includes(commentSymbols, character)) {
        stripping = true;
        continue;
      }

      if (character == '\n') {
        commitLine.run();
        strippedText.append(character);
        stripping = false;
        continue;
      }

      if (!stripping) {
        strippedLine.append(character);
      }
    }

    commitLine.run();

    return strippedText.toString();
  }

  /**
   * Returns true if array if strings contain specified character.
   */
  public static Boolean includes(String[] commentSymbols, char character) {
    for (String commentSymbol : commentSymbols) {
      if (commentSymbol.equals(String.valueOf(character))) {
        return true;
      }
    }

    return false;
  }
}
