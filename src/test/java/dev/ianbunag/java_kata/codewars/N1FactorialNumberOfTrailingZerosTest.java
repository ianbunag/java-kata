package dev.ianbunag.java_kata.codewars;

import org.junit.Test;
import static org.junit.Assert.*;

public class N1FactorialNumberOfTrailingZerosTest {
  @Test
  public void testZeros() throws Exception {
    assertEquals(N1FactorialNumberOfTrailingZeros.zeros(0), 0);
    assertEquals(N1FactorialNumberOfTrailingZeros.zeros(6), 1);
    assertEquals(N1FactorialNumberOfTrailingZeros.zeros(14), 2);
    assertEquals(N1FactorialNumberOfTrailingZeros.zeros(1000), 249);
    assertEquals(N1FactorialNumberOfTrailingZeros.zeros(35167330), 8791828);
  }
}
