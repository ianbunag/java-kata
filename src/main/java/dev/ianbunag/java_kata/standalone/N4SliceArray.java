package dev.ianbunag.java_kata.standalone;

/**
 * Challenge solution.
 */
public class N4SliceArray {
    /**
     * Challenge solution.
     * <ul>
     *  <li>Average time complexity: O(n)
     *  <li>Worst time complexity:   O(n)
     *  <li>Space complexity:        O(n)
     * </ul>
     *
     * @return challenge answer.
     */
    public static char[] sliceArray(char[] chars, int start, int length) {
        if (chars == null || length < 0 || start < 0 || start + length > chars.length) {
            return null;
        }

        var slice = new char[length];

        for (int charIndex = start, sliceIndex = 0;
             sliceIndex < length;
             charIndex += 1, sliceIndex += 1) {
            slice[sliceIndex] = chars[charIndex];
        }

        return slice;
    }
}
