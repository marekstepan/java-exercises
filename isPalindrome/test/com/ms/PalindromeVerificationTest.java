package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeVerificationTest {

  @Test
  void isPalindromeTest() {
    String inputString = "Kobyla ma maly bok";
    assertTrue(PalindromeVerification.isPalindrome(inputString));
    String falseInputString = "Kobela ma maly bok";
    assertFalse(PalindromeVerification.isPalindrome(falseInputString));
  }
}