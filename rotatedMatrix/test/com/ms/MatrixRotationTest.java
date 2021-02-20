package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixRotationTest {

  @Test
  void rotateMatrix() {
    int[][] inputMatrix = {{1, 3}, {4, 5}};
    int[][] outputMatrix = {{4, 1}, {5, 3}};
    assertArrayEquals(outputMatrix, MatrixRotation.rotateMatrix(inputMatrix));
  }
}