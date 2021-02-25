package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {

  @Test
  void findGCDTest() {
    assertEquals(20, GCD.findGCD(140, 40));
  }
}