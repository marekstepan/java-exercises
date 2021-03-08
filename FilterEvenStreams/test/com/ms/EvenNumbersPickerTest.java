package com.ms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumbersPickerTest {

  @Test
  void filterEvenNumbersTest() {
    List<Integer> numbers = Arrays.asList(2, 4, -3, -5, -8, -4, -9, 13, 20, 7, 10, 11, 15);
    List<Integer> expectedResultNumbers = Arrays.asList(2, 4, -8, -4, 20, 10);
    assertEquals(expectedResultNumbers, EvenNumbersPicker.filterEvenNumbers(numbers));

  }
}