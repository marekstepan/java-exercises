package com.ms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UniqueValuesInArrayTest {

  @Test
  void findUniqueItemsTest() {
    int[] numbers = (new int[] {1, 11, 34, 11, 52, 61, 1, 34, 89, 89, 89});
    Integer[] expectedUniqueNumbers = (new Integer[] {1, 11, 34, 52, 61, 89});
    Integer[] returnedUniqueNumbers = UniqueValuesInArray.findUniqueItems(numbers);
    Arrays.sort(returnedUniqueNumbers);
    assertTrue(Arrays.equals(expectedUniqueNumbers, returnedUniqueNumbers));
  }
}