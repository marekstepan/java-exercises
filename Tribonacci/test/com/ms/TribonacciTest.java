package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TribonacciTest {

  @Test
  void listTribonacciNumbersTest() {
    assertEquals(3136, Tribonacci.listTribonacciNumbers(15).get(14));
  }
}