package com.ms;

import java.util.Arrays;

// Write a method which takes two matrices as parameters and returns a new matrix.
// The method should compare each element in the input matrices and fill the returned
// matrix with the greater values. You only have to deal with square matrices.
// A square matrix is a matrix with the same number of rows and columns.
public class MatrixComparison {

    public static void main(String[] args) {
        int[][] matrixA = {{2, 1}, {0, 1}};
        int[][] matrixB = {{0, 3}, {-1, 1}};
        int[][] outputMatrix = pickHigherValues(matrixA, matrixB);
        for (int i = 0; i < matrixA.length; i++) {
            System.out.println(Arrays.toString(outputMatrix[i]));

        }
    }

    public static int[][] pickHigherValues(int[][] matrixA, int[][] matrixB) {
        int[][] outputMatrix = new int[matrixA.length][matrixA.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if(matrixA[i][j] >= matrixB[i][j]) {
                    outputMatrix[i][j] = matrixA[i][j];
                } else {
                    outputMatrix[i][j] = matrixB[i][j];
                }
            }
        }
        return outputMatrix;
    }
}
