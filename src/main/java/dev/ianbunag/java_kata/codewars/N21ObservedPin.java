package dev.ianbunag.java_kata.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Challenge solution.
 */
public class N21ObservedPin {
  private N21ObservedPin() { }

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
  public static List<String> getPINs(String observedPins) {
    return Arrays
        .stream(observedPins.split(""))
        .map(N21ObservedPin::getAdjacents)
        .reduce(N21ObservedPin::getCombinations)
        .get();
  }

  public static HashMap<String, List<String>> ADJACENTS = new HashMap<>() {
    {
      put("1", Arrays.asList("1", "2", "4"));
      put("2", Arrays.asList("2", "1", "3", "5"));
      put("3", Arrays.asList("3", "2", "6"));
      put("4", Arrays.asList("4", "1", "5", "7"));
      put("5", Arrays.asList("5", "2", "4", "6", "8"));
      put("6", Arrays.asList("6", "3", "5", "9"));
      put("7", Arrays.asList("7", "4", "8"));
      put("8", Arrays.asList("8", "5", "7", "9", "0"));
      put("9", Arrays.asList("9", "6", "8"));
      put("0", Arrays.asList("0", "8"));
    }
  };

  private static List<String> getAdjacents(String pin) {
    return N21ObservedPin.ADJACENTS.get(pin);
  }

  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n^2)
    *  <li>Worst time complexity:   O(n^2)
    *  <li>Space complexity:        O(n)
    * </ul>
    *
    * @return challenge answer.
    */
  private static List<String> getCombinations(List<String> accumulation, List<String> next) {
    return accumulation.stream()
        .flatMap(string -> next.stream().map(nextString -> string + nextString))
        .collect(Collectors.toList());
  }
}
