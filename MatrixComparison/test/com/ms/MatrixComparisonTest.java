package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixComparisonTest {

  @Test
  void pickHigherValuesTestAB() {
    int[][] matrixA = {{2, 1}, {0, 1}};
    int[][] matrixB = {{0, 3}, {-1, 1}};
    int[][] outputMatrixAB = {{2, 3}, {0, 1}};
    assertArrayEquals(outputMatrixAB, MatrixComparison.pickHigherValues(matrixA, matrixB));
  }

  @Test
  void pickHigherValuesTestCD() {
    int[][] matrixC = {{0, 0}, {0, -1}};
    int[][] matrixD = {{0, 0}, {-1, 0}};
    int[][] outputMatrixCD = {{0, 0}, {0, 0}};
    assertArrayEquals(outputMatrixCD, MatrixComparison.pickHigherValues(matrixC, matrixD));
  }

}