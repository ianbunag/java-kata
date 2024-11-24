package dev.ianbunag.java_kata.standalone;

public class N9TwoThreeFiveArray {
    /**
     * <ul>
     *  <li>Average time complexity: O(n)
     *  <li>Worst time complexity:   O(n)
     *  <li>Space complexity:        O(1)
     * </ul>
     */
    public static int is235Array(int[] array) {
        if (array == null) {
            return 0;
        }

        for (int value : array) {
            var matches = 0;

            if (value % 2 == 0) {
                matches += 1;
            }

            if (value % 3 == 0) {
                matches += 1;
            }

            if (value % 5 == 0) {
                matches += 1;
            }

            if (matches > 1) {
                return 0;
            }
        }

        return 1;
    }
}
