package dev.ianbunag.java_kata.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class N12Int32ToIPv4Test {
  @Test
  public void testChallenge() throws Exception {
		assertEquals("7.241.242.94", N12Int32ToIPv4.longToIP(133296734L));
		assertEquals("0.0.0.0", N12Int32ToIPv4.longToIP(0));
		assertEquals("128.32.10.1", N12Int32ToIPv4.longToIP(2149583361L));
		assertEquals("128.114.17.104", N12Int32ToIPv4.longToIP(2154959208L));
  }
}
