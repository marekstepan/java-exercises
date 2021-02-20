package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixSymmetryCheckTest {


  @Test
  public void isSymmetricTest() {
    int[][] matrixA = {{1, 0, 1}, {0, 2, 2}, {1, 2, 5}};
    assertTrue(MatrixSymmetryCheck.isSymmetric(matrixA));
  }

  @Test
  public void isNotSymmetricTest() {
    int[][] matrixB = {{7, 7, 7}, {6, 5, 7}, {1, 2, 1}};
    assertFalse(MatrixSymmetryCheck.isSymmetric(matrixB));
  }

}