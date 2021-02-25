package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMaximumRecursionTest {

  @Test
  void findMaxTest() {
    int[] a = {5, 200, 10, -1, 0, 3};
    int n = a.length;
    assertEquals(200, ArrayMaximumRecursion.findMax(a, n));
  }
}