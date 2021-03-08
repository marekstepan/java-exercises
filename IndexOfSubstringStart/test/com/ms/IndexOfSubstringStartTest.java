package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexOfSubstringStartTest {

  @Test
  void subStrTest() {
    String string = "Hymeae saturnia hymeae nossinussa\n" +
        "Vacua venessula vacua nekitella\n" +
        "Tuphia vanessa venessa enovalla\n" +
        "Sacyare oponalla oponalla hyniassan";
    String substring1 = "nekitella";
    String substring2 = "boromani";
    assertEquals(56, IndexOfSubstringStart.subStr(string, substring1));
    assertEquals(-1, IndexOfSubstringStart.subStr(string, substring2));
  }
}