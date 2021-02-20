package com.ms;

public class MatrixSymmetryCheck {

  public static void main(String[] args) {
    int[][] matrixA = {{1, 0, 1}, {0, 2, 2}, {1, 2, 5}};
    int[][] matrixB = {{7, 7, 7}, {6, 5, 7}, {1, 2, 1}};
    System.out.println(isSymmetric(matrixB));

  }

  public static boolean isSymmetric(int[][] matrix) {
    if (matrix.length != matrix[0].length) {
      return false;
    } else {
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix.length; j++) {
          if (i == j) {
            continue;
          } else if (matrix[i][j] != matrix[j][i]) {
            return false;
          }
        }
      }
    }
    return true;
  }
}
