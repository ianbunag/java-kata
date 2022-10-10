package dev.ianbunag.java_kata.codewars;

import static org.junit.Assert.*;
import org.junit.Test;

public class N10TwiceLinearTest {
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void testChallenge() throws Exception {
        System.out.println("Fixed Tests dblLinear");
        testing(N10TwiceLinear.dblLinear(10), 22);
        testing(N10TwiceLinear.dblLinear(20), 57);
        testing(N10TwiceLinear.dblLinear(30), 91);
        testing(N10TwiceLinear.dblLinear(50), 175);
        testing(N10TwiceLinear.dblLinear(100), 447);
        testing(N10TwiceLinear.dblLinear(500), 3355);
    }
}
