package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsInStringTest {

  @Test
  void sumDigitsInStringTest() {
    String string = "f8s5ds7fc4s5cd";
    assertEquals(29, DigitsInString.sumDigitsInString(string));
  }
}