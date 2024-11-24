package dev.ianbunag.java_kata.leetcode;

/**
 * Challenge solution.
 */
public class N43ReverseInteger {
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
    public static int reverseInteger(int value) {
        var reversed = 0;
        var absoluteValue = Math.abs(value);

        while (absoluteValue > 0) {
            reversed = (reversed * 10) + (absoluteValue % 10);
            absoluteValue /= 10;
        }

        return value < 0 ? -reversed : reversed;
    }
}
