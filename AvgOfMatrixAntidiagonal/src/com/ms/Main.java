package com.ms;

public class Main {

    public static void main(String[] args) {
	int[][] matrix = {{1, 2, 3}, {3, 4, 6}, {5, 2, 5}};
	    if((matrix.length == 0) || (matrix[0].length == 0) || (matrix.length != matrix[0].length)) {
            System.out.println("Are you kidding me?");
        } else {
            System.out.println(getAvgOfAntidiagonal(matrix));
        }
    }

    public static double getAvgOfAntidiagonal(int[][] matrix) {
        double avg = 0;
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(j == matrix.length - i - 1) {
                    sum += matrix[i][j];
                }
            }
            avg = (double)sum / (double)matrix.length;
        }
        return avg;
    }
}
