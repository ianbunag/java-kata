package dev.ianbunag.java_kata.standalone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Challenge tests.
 */
public class N7PointOfEquilibriumTest {
    @Test
    public void testPointOfEquilibrium() throws Exception {
        assertEquals(3, N7PointOfEquilibrium.pointOfEquilibrium(new int[]{1, 8, 3, 7, 10, 2}));
        assertEquals(2, N7PointOfEquilibrium.pointOfEquilibrium(new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1}));
        assertEquals(5, N7PointOfEquilibrium.pointOfEquilibrium(new int[]{2, 1, 1, 1, 2, 1, 7}));
        assertEquals(-1, N7PointOfEquilibrium.pointOfEquilibrium(new int[]{1, 2, 3}));
        assertEquals(-1, N7PointOfEquilibrium.pointOfEquilibrium(new int[]{3, 4, 5, 10}));
        assertEquals(-1, N7PointOfEquilibrium.pointOfEquilibrium(new int[]{1, 2, 10, 3, 4}));
    }
}
