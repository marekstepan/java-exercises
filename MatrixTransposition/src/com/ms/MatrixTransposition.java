package com.ms;

import java.util.Arrays;
import java.util.Stack;

public class MatrixTransposition {

    //Matrix transposition script
    public static void main(String[] args) {
        int[][] inputMatrix = { { 2, 3, 4 }, { 5, 6, 4 } };
        int[][] outputMatrix = transposeMatrix(inputMatrix);
        for (int i = 0; i < inputMatrix[0].length; i++) {
            System.out.println(Arrays.toString(outputMatrix[i]));

        }
    }

    public static int[][] transposeMatrix(int[][] inputMatrix) {
        int xDim = inputMatrix.length;
        int yDim = inputMatrix[0].length;
        int[][] outputMatrix = new int[yDim][xDim];
        Stack<Integer> transpositionStack = new Stack<Integer>();

        for (int i = 0; i < xDim; i++) {
            for (int j = 0; j < yDim; j++) {
                transpositionStack.push(inputMatrix[i][j]);
                outputMatrix[j][i] = transpositionStack.pop();
            }
        }
        return outputMatrix;

    }
}
