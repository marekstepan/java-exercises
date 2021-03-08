package com.ms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DigitsInNumbersInArrayTest {

  @Test
  void findMatchingIndexesTest() {
    int[] numbers = new int[] {1, 11, 34, 52, 61, 72, 222};
    Integer[] indexArray = new Integer[] {3, 5, 6};
    assertTrue(Arrays.equals(indexArray, DigitsInNumbersInArray.findMatchingIndexes(2, numbers)));
  }
}