package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostCommonWordTest {

  @Test
  void findMostFrequentWordTest() {
    String s = "aj aj aj vaj vaj ajajaj";
    assertEquals("aj", MostCommonWord.findMostFrequentWord(s));
  }
}