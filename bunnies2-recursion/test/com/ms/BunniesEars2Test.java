package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BunniesEars2Test {

  @Test
  void countEarsTest() {
    assertEquals(12, BunniesEars2.countEars(5));
    assertEquals(15,BunniesEars2.countEars(6));
  }
}