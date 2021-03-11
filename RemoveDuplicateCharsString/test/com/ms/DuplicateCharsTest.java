package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateCharsTest {

  @Test
  void removeDuplicateCharsTest() {
    String s = "Get backckckckckck!";
    assertEquals("Get back!", DuplicateChars.removeDuplicateChars(s));
  }
}