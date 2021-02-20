package com.ms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTranspositionTest {

  private MatrixTransposition matrixTransposition;

  @BeforeEach
  void setUp() {
    matrixTransposition = new MatrixTransposition();
    int[][] inputMatrix = { { 2, 3, 4 }, { 5, 6, 4 } };
  }

  @Test
  void shouldTransposeMatrix() {
    int[][] inputMatrix = { { 2, 3, 4 }, { 5, 6, 4 } };
    int[][] outputMatrix = matrixTransposition.transposeMatrix(inputMatrix);
    assertEquals(inputMatrix.length, outputMatrix[0].length);
    assertEquals(inputMatrix[0].length, outputMatrix.length);
    assertEquals(outputMatrix[1][0], inputMatrix[0][1]);

  }
}