package dev.ianbunag.java_kata.codewars;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class N5LastDigitLargeNumberTest {
  @Test
  public void testChallenge() throws Exception {
    assertEquals(8, N5LastDigitLargeNumber.lastDigit(new BigInteger("2"), new BigInteger("7")));
    assertEquals(4, N5LastDigitLargeNumber.lastDigit(new BigInteger("4"), new BigInteger("1")));
    assertEquals(6, N5LastDigitLargeNumber.lastDigit(new BigInteger("4"), new BigInteger("2")));
    assertEquals(9, N5LastDigitLargeNumber.lastDigit(new BigInteger("9"), new BigInteger("7")));
    assertEquals(3, N5LastDigitLargeNumber.lastDigit(new BigInteger("1060007227"), new BigInteger("1363524911")));
    assertEquals(8, N5LastDigitLargeNumber.lastDigit(new BigInteger("126688"), new BigInteger("551077")));
    assertEquals(3, N5LastDigitLargeNumber.lastDigit(new BigInteger("1574284547"), new BigInteger("1774881059")));
    assertEquals(7, N5LastDigitLargeNumber.lastDigit(new BigInteger("1286824781380250071275687450781327142193570934450301544594592690784850588691157040449114413"), new BigInteger("1630816238606985893790252948928375980531601636137713773576902133910314392816519053251431891")));
    assertEquals(6, N5LastDigitLargeNumber.lastDigit(new BigInteger("1871287648"), new BigInteger("1760584432")));
    assertEquals(5, N5LastDigitLargeNumber.lastDigit(new BigInteger("20115"), new BigInteger("1036920")));
    assertEquals(6, N5LastDigitLargeNumber.lastDigit(new BigInteger("1898317912"), new BigInteger("1432173996")));
    assertEquals(5, N5LastDigitLargeNumber.lastDigit(new BigInteger("395401294631070537067302674701094351322547828464517421054189928504523409655177213900113565"), new BigInteger("1992002119744732955560498022079653493531205749258487073010326952769891299580361086459134936")));
    assertEquals(1, N5LastDigitLargeNumber.lastDigit(new BigInteger("614071112137558567392491756324"), new BigInteger("0")));
    assertEquals(6, N5LastDigitLargeNumber.lastDigit(new BigInteger("1606938044258990275541962092341162602522202993782792835301376"), new BigInteger("2037035976334486086268445688409378161051468393665936250636140449354381299763336706183397376")));
  }
}
