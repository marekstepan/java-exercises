package com.ms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitsInNumbersInArray {

    public static void main(String[] args) {
        //Create a function that takes a number and an array of integers as parameters
        //It returns the indices of the integers of the array which contain the given number
        //or returns an empty array (if the number is not part of any of the integers in the array)
        //  Example:
        //System.out.println(Arrays.toString(findMatchingIndexes(1, new int[] {1, 11, 34, 52, 61})));
        //  should print: `[0, 1, 4]`
        int[] numbers = new int[] {1, 11, 34, 52, 61};
        System.out.println(Arrays.toString(findMatchingIndexes(1, numbers)));
    }

    public static Integer[] findMatchingIndexes(int n, int[] intArray) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < intArray.length; i++) {
            int res = intArray[i];
            while(res > 0) {
                if(res % 10 == n) {
                    indices.add(i);
                    break;
                 }
                res = res / 10;
            }
        }
        Integer[] indicesArray = indices.toArray(indices.toArray(new Integer[0]));
        return indicesArray;
    }
}
