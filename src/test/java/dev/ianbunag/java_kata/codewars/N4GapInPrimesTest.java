package dev.ianbunag.java_kata.codewars;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class N4GapInPrimesTest {
  @Test
  public void testChallenge() throws Exception {
    assertEquals("[101, 103]", Arrays.toString(N4GapInPrimes.gap(2,100,110)));
    assertEquals("[103, 107]", Arrays.toString(N4GapInPrimes.gap(4,100,110)));
    assertEquals(null, N4GapInPrimes.gap(6,100,110));
    assertEquals("[359, 367]", Arrays.toString(N4GapInPrimes.gap(8,300,400)));
    assertEquals("[337, 347]", Arrays.toString(N4GapInPrimes.gap(10,300,400)));
  }
}
