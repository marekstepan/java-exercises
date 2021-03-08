package com.ms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SquaredBiggerThan20Test {

  @Test
  void selectNumbersSquaredBigger20Test() {
    List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5, 1);
    List<Integer> numbersSquaredBiggerThan20 = Arrays.asList(9, 8, 6, 5);
    assertEquals(numbersSquaredBiggerThan20, SquaredBiggerThan20.selectNumbersSquaredBigger20(numbers));
  }
}