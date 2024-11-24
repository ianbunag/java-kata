package dev.ianbunag.java_kata.standalone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Challenge tests.
 */
public class N2ArrayIsCenteredTest {
    @Test
    public void testArrayIsCentered() throws Exception {
        assertEquals(0, N2ArrayIsCentered.arrayIsCentered(new int[]{}));
        assertEquals(0, N2ArrayIsCentered.arrayIsCentered(new int[]{1, 2, 3, 4}));
        assertEquals(0, N2ArrayIsCentered.arrayIsCentered(null));
        assertEquals(0, N2ArrayIsCentered.arrayIsCentered(new int[]{1, 2, 3, 4, 5}));
        assertEquals(1, N2ArrayIsCentered.arrayIsCentered(new int[]{3, 2, 1, 4, 5}));
        assertEquals(0, N2ArrayIsCentered.arrayIsCentered(new int[]{3, 2, 1, 4, 1}));
        assertEquals(1, N2ArrayIsCentered.arrayIsCentered(new int[]{10}));
    }
}
