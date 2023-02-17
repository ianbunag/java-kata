package dev.ianbunag.java_kata.leetcode;

/**
 * Challenge solution.
 */
public class N9SearchInRotatedSortedArray {
  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(log n)
    *  <li>Worst time complexity:   O(log n)
    *  <li>Space complexity:        O(1)
    * </ul>
    *
    * @return challenge answer.
    */
  public int search(int[] nums, int target) {
    var leftPointer = 0;
    var rightPointer = nums.length - 1;

    while (leftPointer <= rightPointer) {
      var middlePointer = (leftPointer + rightPointer) / 2;

      if (target == nums[middlePointer]) {
        return middlePointer;
      }

      var middleIsInLeftPortion = nums[leftPointer] <= nums[middlePointer];

      if (middleIsInLeftPortion) {
        var targetIsInRightPortion = target > nums[middlePointer] || target < nums[leftPointer];

        if (targetIsInRightPortion) {
          leftPointer = middlePointer + 1;
        } else {
          rightPointer = middlePointer - 1;
        }
      } else {
        var targetIsInLeftPortion = target < nums[middlePointer] || target > nums[rightPointer];

        if (targetIsInLeftPortion) {
          rightPointer = middlePointer - 1;
        } else {
          leftPointer = middlePointer + 1;
        }
      }
    }

    return -1;
  }
}
