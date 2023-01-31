package dev.ianbunag.java_kata.leetcode;

import java.util.HashMap;
import java.util.Stack;

/**
 * Challenge solution.
 */
public class N8ValidParenthesis {
  private static final HashMap<Character, Character> PAIRS = new HashMap<>() {{
      put('(', ')');
      put('{', '}');
      put('[', ']');
    }};

  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(log n)
    *  <li>Worst time complexity:   O(n)
    *  <li>Space complexity:        O(n)
    * </ul>
    *
    * @return challenge answer.
    */
  public boolean isValid(String string) {
    Stack<Character> openings = new Stack<Character>();

    for (char character : string.toCharArray()) {
      if (N8ValidParenthesis.PAIRS.containsKey(character)) {
        openings.push(character);
        continue;
      }

      if (openings.size() < 1 || N8ValidParenthesis.PAIRS.get(openings.pop()) != character) {
        return false;
      }
    }

    return openings.empty();
  }
}
