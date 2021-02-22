package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvgOfMatrixAntidiagonalTest {

  @Test
  void getAvgOfAntidiagonalTest() {
    int[][] matrixB = {{1, 2, 5}, {3, 20, 6}, {35, 3, 5}};
    assertEquals(20, AvgOfMatrixAntidiagonal.getAvgOfAntidiagonal(matrixB));
  }
}