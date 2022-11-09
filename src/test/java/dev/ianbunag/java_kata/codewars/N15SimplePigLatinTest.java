package dev.ianbunag.java_kata.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class N15SimplePigLatinTest {
  @Test
  public void testChallenge() throws Exception {
    assertEquals("igPay atinlay siay oolcay", N15SimplePigLatin.pigIt("Pig latin is cool"));
    assertEquals("hisTay siay ymay tringsay", N15SimplePigLatin.pigIt("This is my string"));
    assertEquals("elloHay orldway !", N15SimplePigLatin.pigIt("Hello world !"));
  }
}
