package dev.ianbunag.java_kata.codewars;

import static org.junit.Assert.*;
import org.junit.Test;

public class N8StringsMixTest {
  @Test
  public void testChallenge() throws Exception {
    assertEquals("1:ee/1:ll/1:oo", N8StringsMix.mix("Lords of the Fallen", "gamekult"));
    assertEquals("2:eeeee/2:yy/=:hh/=:rr", N8StringsMix.mix("Are they here", "yes, they are here"));
    assertEquals("", N8StringsMix.mix("codewars", "codewars"));
    assertEquals("1:ooo/1:uuu/2:sss/=:nnn/1:ii/2:aa/2:dd/2:ee/=:gg",
            N8StringsMix.mix("looping is fun but dangerous", "less dangerous than coding"));
    assertEquals("1:aaa/1:nnn/1:gg/2:ee/2:ff/2:ii/2:oo/2:rr/2:ss/2:tt",
            N8StringsMix.mix(" In many languages", " there's a pair of functions"));
    assertEquals("1:nnnnn/1:ooooo/1:tttt/1:eee/1:gg/1:ii/1:mm/=:rr",
            N8StringsMix.mix("A generation must confront the looming ", "codewarrs"));
  }
}
