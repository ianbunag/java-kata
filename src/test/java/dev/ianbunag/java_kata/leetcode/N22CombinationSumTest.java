package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.Test;

/**
 * Challenge tests.
 */
public class N22CombinationSumTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N22CombinationSum();

    assertIterableEquals(
        Arrays.asList(Arrays.asList(2, 2, 3), Arrays.asList(7)),
        solution.combinationSum(new int[]{2, 3, 6, 7}, 7)
    );
    assertIterableEquals(
        Arrays.asList(Arrays.asList(2, 2, 2, 2), Arrays.asList(2, 3, 3), Arrays.asList(3, 5)),
        solution.combinationSum(new int[]{2, 3, 5}, 8)
    );
    assertIterableEquals(
        Arrays.asList(Arrays.asList(2, 2, 2), Arrays.asList(3, 3)),
        solution.combinationSum(new int[]{2, 3}, 6)
    );
  }
}
