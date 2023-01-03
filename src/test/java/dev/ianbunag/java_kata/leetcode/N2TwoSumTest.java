package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N2TwoSumTest {
  @Test
  public void it_should_return_start_indexes() throws Exception {
    var solution = new N2TwoSum();
    var result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
    var expected = new int[]{1, 0};

    assertArrayEquals(result, expected);
  }

  @Test
  public void it_should_return_end_indexes() throws Exception {
    var solution = new N2TwoSum();
    var result = solution.twoSum(new int[]{3, 2, 4}, 6);
    var expected = new int[]{2, 1};

    assertArrayEquals(result, expected);
  }

  @Test
  public void it_should_return_input() throws Exception {
    var solution = new N2TwoSum();
    var result = solution.twoSum(new int[]{3, 3}, 6);
    var expected = new int[]{1, 0};

    assertArrayEquals(result, expected);
  }
}
