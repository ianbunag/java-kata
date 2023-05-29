package dev.ianbunag.java_kata.leetcode;

/**
 * Challenge solution.
 */
public class N40SingleNumber {
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
  public int singleNumber(int[] nums) {
    for (var index = 1; index < nums.length; index += 1) {
      nums[0] ^= nums[index];
    }

    return nums[0];
  }
}
