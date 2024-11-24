package dev.ianbunag.java_kata.standalone;

/**
 * Challenge solution.
 */
public class N3EvenOddSums {
    /**
     * Challenge solution.
     * <ul>
     *  <li>Average time complexity: O(1)
     *  <li>Worst time complexity:   O(1)
     *  <li>Space complexity:        O(1)
     * </ul>
     *
     * @return challenge answer.
     */
    public static int evenOddSum(int[] array) {
        if (array == null) {
            return 0;
        }

        var sum = 0;

        for (int value : array) {
            if (value % 2 == 0) {
                sum -= value;
                continue;
            }

            sum += value;
        }

        return sum;
    }
}
