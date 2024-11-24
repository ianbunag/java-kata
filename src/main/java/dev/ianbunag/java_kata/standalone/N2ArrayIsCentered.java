package dev.ianbunag.java_kata.standalone;

/**
 * Challenge solution.
 */
public class N2ArrayIsCentered {
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
    public static int arrayIsCentered(int[] array) {
        if (array == null || array.length % 2 == 0) {
            return 0;
        }

        var middleIndex = array.length / 2;

        for (var index = 0; index < array.length; index += 1) {
            if (index != middleIndex && array[index] <= array[middleIndex]) {
                return 0;
            }
        }

        return 1;
    }
}
