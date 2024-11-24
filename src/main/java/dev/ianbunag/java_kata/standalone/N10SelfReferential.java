package dev.ianbunag.java_kata.standalone;

import java.util.HashMap;

public class N10SelfReferential {
    /**
     * <ul>
     *  <li>Average time complexity: O(n)
     *  <li>Worst time complexity:   O(n)
     *  <li>Space complexity:        O(n)
     * </ul>
     */
    public static int isSelfReferential(int[] array) {
        if (array == null) {
            return 0;
        }

        var counts = new HashMap<Integer, Integer>();

        for (int value : array) {
            if (!counts.containsKey(value)) {
                counts.put(value, 0);
            }

            counts.put(value, counts.get(value) + 1);
        }

        for (var index = 0; index < array.length; index += 1) {
            if (array[index] != counts.getOrDefault(index, 0)) {
                return 0;
            }
        }

        return 1;
    }
}
