package dev.ianbunag.java_kata.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Challenge solution.
 */
public class N22CombinationSum {
  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(2 ^ n)
    *  <li>Worst time complexity:   O(2 ^ n)
    *  <li>Space complexity:        O(2 ^ n)
    * </ul>
    *
    * @return challenge answer.
    */
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    var combinations = new ArrayList<List<Integer>>();

    this.findCombinations(candidates, target, 0, new ArrayList<Integer>(), combinations);

    return combinations;
  }

  /**
    * DFS solution.
    * <ul>
    *  <li>Average time complexity: O(2 ^ n)
    *  <li>Worst time complexity:   O(2 ^ n)
    *  <li>Space complexity:        O(2 ^ n)
    * </ul>
    */
  public void findCombinations(
      int[] candidates,
      int target,
      int total,
      List<Integer> currentCombination,
      List<List<Integer>> combinations
  ) {
    if (total == target) {
      combinations.add(new ArrayList<>(currentCombination));
      return;
    }

    if (candidates.length < 1 || total > target) {
      return;
    }

    var currentNumber = candidates[0];

    // Find possible combinations including current number, allowing repetition
    currentCombination.add(currentNumber);
    this.findCombinations(
        candidates,
        target,
        total + currentNumber,
        currentCombination,
        combinations
    );
    currentCombination.remove(currentCombination.size() - 1);

    // Find possible combinations excluding current number
    this.findCombinations(
        Arrays.copyOfRange(candidates, 1, candidates.length),
        target,
        total,
        currentCombination,
        combinations
    );

    return;
  }
}
