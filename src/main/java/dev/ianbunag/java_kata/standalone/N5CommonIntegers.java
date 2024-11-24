package dev.ianbunag.java_kata.standalone;

import java.util.ArrayList;

/**
 * Challenge solution.
 */
public class N5CommonIntegers {
    /**
     * Challenge solution.
     * <ul>
     *  <li>Average time complexity: O(n ^ 2)
     *  <li>Worst time complexity:   O(n ^ 2)
     *  <li>Space complexity:        O(n)
     * </ul>
     *
     * @return challenge answer.
     */
    public static int[] commonIntegers(int[] first, int[] second) {
        if (first == null || second == null) {
            return null;
        }

        var min = first.length < second.length ? first.length : second.length;
        var smallest = second;
        var largest = first;
        var commons = new int[min];
        var commonsIndex = 0;

        if (first.length == min) {
            smallest = first;
            largest = second;
        }

        for (int smallValue : smallest) {
            for (int largeValue : largest) {
                if (smallValue == largeValue) {
                    commons[commonsIndex] = largeValue;
                    commonsIndex += 1;
                }
            }
        }

        var allCommons = new int[commonsIndex];

        for (var index = 0; index < commonsIndex; index += 1) {
            allCommons[index] = commons[index];
        }

        return allCommons;
    }
}
