package com.ms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SecondMostFrequentCharinStringTest {

  @Test
  void getSecondMostFrequentTest() {
    String string = "Garlands evergreen\n" +
        "Forget-me-not wreaths\n" +
        "Chaplets see me drugged\n" +
        "I could die in a rosary";
    List<Character> expectedOutput = new ArrayList<>();
    expectedOutput.add('r');
    assertEquals(expectedOutput, SecondMostFrequentCharinString.getSecondMostFrequent(string));

  }
}