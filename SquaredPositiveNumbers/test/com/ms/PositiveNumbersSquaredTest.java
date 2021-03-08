package com.ms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PositiveNumbersSquaredTest {

  @Test
  void getSquaredPositiveNumbers() {
    List<Integer> numbers = Arrays.asList(1, -5, 7, 8, 12, -6);
    List<Integer> squaredPositiveNumbers = Arrays.asList(1, 49, 64, 144);

    assertEquals(squaredPositiveNumbers, PositiveNumbersSquared.getSquaredPositiveNumbers(numbers));
  }
}