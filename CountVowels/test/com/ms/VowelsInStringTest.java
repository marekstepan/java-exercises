package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsInStringTest {

  @Test
  void countVowels() {
    String string = "Repeat, he dreams of a doll home";
    assertEquals(11, VowelsInString.countVowels(string));
  }
}