package com.ms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramVerificationTest {
  private AnagramVerification anagramVerification;

  @BeforeEach
  public void setUp() {
    AnagramVerification anagramVerification = new AnagramVerification();
  }

  @Test
  void isAnagram() {
    String string1 = "funeral";
    String string2 = "real fun";
    String string3 = "real gun";
    assertTrue(anagramVerification.isAnagram(string1, string2));
    assertFalse(anagramVerification.isAnagram(string1, string3));
  }
}