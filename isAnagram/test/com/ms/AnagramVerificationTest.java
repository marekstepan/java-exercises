package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramVerificationTest {

  @Test
  void isAnagramTest() {
    String string1 = "funeral";
    String string2 = "real fun";
    String string3 = "real gun";
    assertTrue(AnagramVerification.isAnagram(string1, string2));
    assertFalse(AnagramVerification.isAnagram(string1, string3));
  }
}