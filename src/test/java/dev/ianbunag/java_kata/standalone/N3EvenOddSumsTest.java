package dev.ianbunag.java_kata.standalone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Challenge tests.
 */
public class N3EvenOddSumsTest {
    @Test
    public void testEvenOddSum() throws Exception {
        assertEquals(0, N3EvenOddSums.evenOddSum(null));
        assertEquals(1, N3EvenOddSums.evenOddSum(new int[]{1}));
        assertEquals(-1, N3EvenOddSums.evenOddSum(new int[]{1, 2}));
        assertEquals(2, N3EvenOddSums.evenOddSum(new int[]{1, 2, 3}));
        assertEquals(-2, N3EvenOddSums.evenOddSum(new int[]{1, 2, 3, 4}));
        assertEquals(-2, N3EvenOddSums.evenOddSum(new int[]{3, 3, 4, 4}));
        assertEquals(0, N3EvenOddSums.evenOddSum(new int[]{3, 2, 3, 4}));
        assertEquals(-2, N3EvenOddSums.evenOddSum(new int[]{4, 1, 2, 3}));
        assertEquals(2, N3EvenOddSums.evenOddSum(new int[]{1, 1}));
        assertEquals(0, N3EvenOddSums.evenOddSum(new int[]{}));
    }
}
