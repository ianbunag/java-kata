package dev.ianbunag.java_kata.standalone;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Challenge solution.
 */
public class N1EncodeAndDecodeStrings {
  private static String DELIMITER = ":";
  private static String ESCAPE_SEQUENCE = "\\\\";
  private static String ESCAPED_DELIMITER = ESCAPE_SEQUENCE + DELIMITER;

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
  public String encode(List<String> strings) {
    return strings
      .stream()
      .map((string) -> string.replace(DELIMITER, ESCAPED_DELIMITER))
      .collect(Collectors.joining(DELIMITER));
  }

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
  public List<String> decode(String encodedString) {
    return Arrays.asList(encodedString.split("(?<!" + ESCAPE_SEQUENCE + ")" + DELIMITER))
      .stream()
      .map((string) -> string.replace(ESCAPED_DELIMITER, DELIMITER))
      .collect(Collectors.toList());
  }
}
