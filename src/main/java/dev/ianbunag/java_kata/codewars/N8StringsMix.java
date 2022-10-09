package dev.ianbunag.java_kata.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Challenge solution.
 */
public class N8StringsMix {
  private N8StringsMix() { }

  /**
   * Challenge solution.
   * <ul>
   *  <li>Average time complexity: O(n log n)
   *  <li>Worst time complexity:   O(n log n)
   *  <li>Space complexity:        O(n log n)
   * </ul>
   *
   * @param s1 First string.
   * @param s2 Second string.
   * @return Mix of strings.
   */
  public static String mix(String s1, String s2) {
    var s1Counts = N8StringsMix.toLowercaseCodePointArray(s1);
    var s2Counts = N8StringsMix.toLowercaseCodePointArray(s2);
    var stringsMix = new ArrayList<LowercaseStringCount>();

    for (var codePoint = 0; codePoint < LowercaseStringCount.TOTAL; codePoint += 1) {
      var s1Value = s1Counts[codePoint];
      var s2Value = s2Counts[codePoint];

      if (s1Value < 2 && s2Value < 2) {
        continue;
      }

      if (s1Value > s2Value) {
        stringsMix.add(new LowercaseStringCount("1", codePoint, s1Value));
        continue;
      }

      if (s1Value < s2Value) {
        stringsMix.add(new LowercaseStringCount("2", codePoint, s2Value));
        continue;
      }

      stringsMix.add(new LowercaseStringCount("=", codePoint, s1Value));
    }


    return stringsMix.stream()
      .sorted()
      .map(Object::toString)
      .collect(Collectors.joining("/"));
  }

  private static int[] toLowercaseCodePointArray(String word) {
    var counts = new int[LowercaseStringCount.TOTAL];
    Arrays.fill(counts, 0);

    for (int index = 0; index < word.length(); index++) {
      var codePoint = LowercaseStringCount.toCodePoint(word.charAt(index));

      if (!LowercaseStringCount.isLowercaseCodePoint(codePoint)) {
        continue;
      }

      counts[codePoint] += 1;
    }

    return counts;
  }

  private static class LowercaseStringCount implements Comparable<LowercaseStringCount> {
    /**
     * Total number of lowercase letters.
     */
    public static final Integer TOTAL = 26;

    /**
     * Code point offset so that `a` would be equal to 0.
     */
    private static final Integer CODE_POINT_OFFSET = 97;

    /**
     * String that letter belongs to.
     */
    private String owner;

    /**
     * Lowercase code point starting with 0.
     */
    private Integer codePoint;
    /**
     * Number of occurrences.
     */
    private Integer count;

    LowercaseStringCount(String owner, Integer codePoint, Integer count) {
      this.owner = owner;
      this.codePoint = codePoint;
      this.count = count;
    }

    public static String fromCodePoint(Integer codePoint) {
      return new String(
          new int[] {codePoint + LowercaseStringCount.CODE_POINT_OFFSET},
          0,
          1
      );
    }

    public static Integer toCodePoint(char character) {
      return ((int) character) - LowercaseStringCount.CODE_POINT_OFFSET;
    }

    public static Boolean isLowercaseCodePoint(Integer codePoint) {
      return codePoint > -1 && codePoint < LowercaseStringCount.TOTAL;
    }

    @Override
    public String toString() {
      return owner
        + ":"
        + LowercaseStringCount.fromCodePoint(codePoint).repeat(count);
    }

    @Override
    public int compareTo(LowercaseStringCount other) {
      if (count < other.count) {
        return 1;
      }

      if (count > other.count) {
        return -1;
      }

      return other.owner.compareTo(owner) * -1;
    }
  }
}
