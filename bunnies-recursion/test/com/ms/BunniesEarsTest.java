package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BunniesEarsTest {

  @Test
  void countEarsTest() {
    assertEquals(20, BunniesEars.countEars(10));
  }
}