package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsInStringTest {

  @Test
  void countVowelsTest() {
    String string = "Repeat, he dreams of a doll home";
    assertEquals(11, VowelsInString.countVowels(string));
  }
}