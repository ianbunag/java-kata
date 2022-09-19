package dev.ianbunag.java_kata.codewars;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class FactorialNumberOfTrailingZerosTest {
  @Test
  public void testZeros() throws Exception {
    assertThat(FactorialNumberOfTrailingZeros.zeros(0), is(0));
    assertThat(FactorialNumberOfTrailingZeros.zeros(6), is(1));
    assertThat(FactorialNumberOfTrailingZeros.zeros(14), is(2));
    assertThat(FactorialNumberOfTrailingZeros.zeros(1000), is(249));
    assertThat(FactorialNumberOfTrailingZeros.zeros(35167330), is(8791828));
  }
}
