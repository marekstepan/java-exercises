package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciRecursionTest {

  @Test
  void findNextFiboTest() {
    assertEquals(13, FibonacciRecursion.findNextFibo(8));
  }
}