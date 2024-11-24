package dev.ianbunag.java_kata.standalone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Challenge tests.
 */
public class N9TwoThreeFiveArrayTest {
    @Test
    public void testIs235Array() throws Exception {
        assertEquals(1, N9TwoThreeFiveArray.is235Array(new int[]{2, 3, 5, 7, 11}));
        assertEquals(0, N9TwoThreeFiveArray.is235Array(new int[]{2, 3, 6, 7, 11}));
        assertEquals(0, N9TwoThreeFiveArray.is235Array(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
        assertEquals(1, N9TwoThreeFiveArray.is235Array(new int[]{2, 4, 8, 16, 32}));
        assertEquals(1, N9TwoThreeFiveArray.is235Array(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1}));
        assertEquals(1, N9TwoThreeFiveArray.is235Array(new int[]{7, 11, 77, 49}));
        assertEquals(1, N9TwoThreeFiveArray.is235Array(new int[]{2}));
        assertEquals(1, N9TwoThreeFiveArray.is235Array(new int[]{}));
        assertEquals(1, N9TwoThreeFiveArray.is235Array(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}));
        assertEquals(0, N9TwoThreeFiveArray.is235Array(null));
    }
}
