package com.ms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueValuesInArray {

    public static void main(String[] args) {
        //Create a function that takes an array of numbers as a parameter
        //and returns an array of integers where every integer is unique (occurs only once)
        //  Example
        //System.out.println(findUniqueItems(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]
        int[] numbers = (new int[] {1, 11, 34, 11, 52, 61, 1, 34});
        System.out.println(Arrays.asList(findUniqueItems(numbers)));
    }

    public static Integer[] findUniqueItems(int[] intArray) {
        Set<Integer> uniquesSet = new HashSet<>();
        for(Integer i : intArray) {
            uniquesSet.add(i);
        }
        return uniquesSet.toArray(new Integer[0]);
    }
}
