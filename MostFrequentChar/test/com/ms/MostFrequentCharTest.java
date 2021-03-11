package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostFrequentCharTest {

  @Test
  void findMostFrequentCharTest() {
    String sourceString = "This is the test string. Zzzzz.";
    assertTrue(MostFrequentChar.findMostFrequentChar(sourceString).contains('t'));
    assertTrue(MostFrequentChar.findMostFrequentChar(sourceString).contains('z'));
    assertTrue(MostFrequentChar.findMostFrequentChar(sourceString).size() == 2);
  }
}