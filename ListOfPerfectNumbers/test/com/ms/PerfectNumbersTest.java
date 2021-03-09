package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersTest {

  @Test
  void listPerfectNumbersTest() {
    int numbers = 10000;
    assertTrue(PerfectNumbers.listPerfectNumbers(numbers).size() == 4);
  }
}