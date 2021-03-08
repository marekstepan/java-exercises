package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringArrayElementInspectionTest {

  @Test
  void subStrListTest() {
    String[] searchArr = new String[] {"why", "am", "I", "doing", "this"};
    assertEquals(0, StringArrayElementInspection.subStrList("hy", searchArr));
    assertEquals(-1, StringArrayElementInspection.subStrList("because", searchArr));
  }
}