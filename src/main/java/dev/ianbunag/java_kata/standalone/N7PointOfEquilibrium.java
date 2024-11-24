package dev.ianbunag.java_kata.standalone;

/**
 * Challenge solution.
 */
public class N7PointOfEquilibrium {
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
    public static int pointOfEquilibrium(int[] values) {
        if (values == null) {
            return -1;
        }

        var leftPointer = 0;
        var leftSum = values[leftPointer];
        var rightPointer = values.length - 1;
        var rightSum = values[rightPointer];

        while (leftPointer < rightPointer && rightPointer - leftPointer != 2) {
            if (leftSum > rightSum) {
                rightPointer -= 1;
                rightSum += values[rightPointer];
            } else {
                leftPointer += 1;
                leftSum += values[leftPointer];
            }
        }

        return rightSum == leftSum ? (rightPointer + leftPointer) / 2 : -1;
    }
}
