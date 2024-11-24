package dev.ianbunag.java_kata.standalone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Challenge tests.
 */
public class N6ReverseIntegerTest {
    @Test
    public void testReverseInteger() throws Exception {
        assertEquals(4321, N6ReverseInteger.reverseInteger(1234));
        assertEquals(12005, N6ReverseInteger.reverseInteger(50021));
        assertEquals(1, N6ReverseInteger.reverseInteger(1));
        assertEquals(1, N6ReverseInteger.reverseInteger(1000));
        assertEquals(0, N6ReverseInteger.reverseInteger(0));
        assertEquals(-54321, N6ReverseInteger.reverseInteger(-12345));
    }
}
