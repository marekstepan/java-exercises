package com.ms;

import java.util.Arrays;

public class MatrixRotation {

    public static void main(String[] args) {
	    int[][] inputMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] outputMatrix = rotateMatrix(inputMatrix);
        for (int i = 0; i < outputMatrix.length; i++) {
            System.out.println(Arrays.toString(outputMatrix[i]));

        }
    }

    public static int[][] rotateMatrix(int[][] inputMatrix) {
        int[][] outputMatrix = new int[inputMatrix[0].length][inputMatrix.length];
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[0].length; j++) {
                outputMatrix[i][j] = inputMatrix[inputMatrix[0].length - j - 1][i];
            }
        }
        return outputMatrix;
    }
}
