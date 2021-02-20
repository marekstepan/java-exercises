package com.ms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeVerificationTest {

  @BeforeEach
  void setUp() {
    PalindromeVerification palindromeVerification = new PalindromeVerification();
  }

  @Test
  void isPalindrome() {
    String inputString = "Kobyla ma maly bok";
    assertTrue(PalindromeVerification.isPalindrome(inputString));
    String falseInputString = "Kobela ma maly bok";
    assertFalse(PalindromeVerification.isPalindrome(falseInputString));
  }
}