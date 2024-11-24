package dev.ianbunag.java_kata.standalone;

public class N8OneTwoThreeArray {
    /**
     * <ul>
     *  <li>Average time complexity: O(n)
     *  <li>Worst time complexity:   O(n)
     *  <li>Space complexity:        O(1)
     * </ul>
     */
    public static int isOneTwoThreeArray(int[] array) {
        if (array == null || array.length == 0 || array.length % 3 != 0) {
            return 0;
        }

        for (var index = 0; index < array.length; index += 1) {
            if (array[index] != EXPECTED_VALUES[index % 3]) {
                return 0;
            }
        }

        return 1;
    }

    public static int[] EXPECTED_VALUES = new int[]{1, 2, 3};
}
