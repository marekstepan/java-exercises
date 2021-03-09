package com.ms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DigitExtractionTest {

  @Test
  void extractDigitsTest() {
    int num = 123456789;
    List<Integer> expectedNumList = Arrays.asList(9,8,7,6,5,4,3,2,1);
    assertEquals(expectedNumList, DigitExtraction.extractDigits(num));
  }
}