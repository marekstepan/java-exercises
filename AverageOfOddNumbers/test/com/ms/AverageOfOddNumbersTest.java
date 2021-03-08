package com.ms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;

class AverageOfOddNumbersTest {

  @Test
  void getOddNumbersAverageTest() {
    List<Integer> numbers = Arrays.asList(5, 9, 1, 2);
    assertEquals(5, AverageOfOddNumbers.getOddNumbersAverage(numbers).getAsDouble());

  }
}