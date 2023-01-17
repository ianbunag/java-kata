package dev.ianbunag.java_kata.leetcode;

/**
 * Challenge solution.
 */
public class N5ContainerWithMostWater {
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
  public int maxArea(int[] heights) {
    var leftPointer = 0;
    var rightPointer = heights.length - 1;
    var maxArea = 0;

    while (leftPointer < rightPointer) {
      var width = rightPointer - leftPointer;
      int height;

      if (heights[leftPointer] <= heights[rightPointer]) {
        height = heights[leftPointer];
        leftPointer += 1;
      } else {
        height = heights[rightPointer];
        rightPointer -= 1;
      }

      var area = width * height;

      maxArea = Math.max(maxArea, area);
    }

    return maxArea;
  }
}
