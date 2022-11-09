package dev.ianbunag.java_kata.codewars;

import java.util.function.BiFunction;

/**
 * Challenge solution.
 */
public class N15SimplePigLatin {
  private N15SimplePigLatin() { }

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
  public static String pigIt(String str) {
    var pigged = new StringBuilder();
    Character firstCharacter = null;

    for (var index = 0; index < str.length(); index += 1) {
      var character = str.charAt(index);

      if (
          firstCharacter == null
          && (
            (character >= 'a' && character <= 'z')
            || (character >= 'A' && character <= 'Z')
          )
      ) {
        firstCharacter = character;
        continue;
      }

      if (character == ' ') {
        N15SimplePigLatin.piggify.apply(pigged, firstCharacter).append(' ');
        firstCharacter = null;
        continue;
      }

      pigged.append(character);
    }

    if (firstCharacter != null) {
      N15SimplePigLatin.piggify.apply(pigged, firstCharacter);
    }

    return pigged.toString();
  }

  private static BiFunction<StringBuilder, Character, StringBuilder> piggify =
      (builder, character) -> builder.append(character).append('a').append('y');
}
