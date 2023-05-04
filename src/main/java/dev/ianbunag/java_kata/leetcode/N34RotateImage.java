package dev.ianbunag.java_kata.leetcode;

/**
 * Challenge solution.
 */
public class N34RotateImage {
  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(log n)
    *  <li>Worst time complexity:   O(log n)
    *  <li>Space complexity:        O(1)
    * </ul>
    */
  public void rotate(int[][] matrix) {
    // Rotate each square boundary
    for (int topLeft = 0, bottomRight = matrix.length - 1;
        topLeft < bottomRight;
        topLeft += 1, bottomRight -= 1) {
      for (int offset = 0, offsets = bottomRight - topLeft;
          offset < offsets;
          offset += 1) {
        final var topValue = matrix[topLeft][topLeft + offset];

        // Move left to top
        matrix[topLeft][topLeft + offset] = matrix[bottomRight - offset][topLeft];
        // Move bottom to left
        matrix[bottomRight - offset][topLeft] = matrix[bottomRight][bottomRight - offset];
        // Move right to bottom
        matrix[bottomRight][bottomRight - offset] = matrix[topLeft + offset][bottomRight];
        // Move top to right
        matrix[topLeft + offset][bottomRight] = topValue;
      }
    }
  }
}
