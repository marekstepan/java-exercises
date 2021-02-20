package com.ms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueValuesInArray {

    // Write a method which takes a 2D array / matrix containing integer numbers
    //It should return the numbers in a list without any duplication
    public static void main(String[] args) {
        int[][] inputMatrix = {{1, 1}, {4, 2}};
        System.out.println(returnUniqueValues(inputMatrix));
    }

    public static List<Integer> returnUniqueValues(int[][] inputArray) {
        HashSet<Integer> outputSet = new HashSet<>();
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[0].length; j++) {
                outputSet.add(inputArray[i][j]);
            }
        }
        List<Integer> outputList = new ArrayList<>(outputSet);
        return outputList;
    }
}
