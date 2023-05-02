package dev.ianbunag.java_kata.leetcode;

/**
 * Challenge solution.
 */
public class N33MaximumSubarray {
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
  public int maxSubArray(int[] nums) {
    var sum = nums[0];
    var max = nums[0];

    for (var index = 1; index < nums.length; index += 1) {
      // Cut off previous contiguous sum if it is negative.
      if (sum < 0) {
        sum = 0;
      }

      sum += nums[index];
      max = Math.max(max, sum);
    }

    return max;
  }
}
