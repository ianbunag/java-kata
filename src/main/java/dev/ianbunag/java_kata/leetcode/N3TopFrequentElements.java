package dev.ianbunag.java_kata.leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Challenge solution.
 */
public class N3TopFrequentElements {
  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n log n)
    *  <li>Worst time complexity:   O(n log n)
    *  <li>Space complexity:        O(n)
    * </ul>
    *
    * @return challenge answer.
    */
  public int[] topKFrequent(int[] numbers, int limit) {
    return Arrays
        .stream(numbers)
        .boxed()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet()
        .stream()
        .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
        .limit(limit)
        .mapToInt(Map.Entry::getKey)
        .toArray();
  }
}
