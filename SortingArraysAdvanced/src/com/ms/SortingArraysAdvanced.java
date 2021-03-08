package com.ms;

import java.util.Arrays;
import java.util.TreeSet;

public class SortingArraysAdvanced {

    public static void main(String[] args) {
	// Create a function that takes an array of numbers as parameter
        //and returns an array where the elements are sorted in ascending numerical order
        //When you are done, add a second boolean parameter to the function
        //If it is `true` sort the array descending, otherwise ascending
        //    Example:
        //    System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //    should print [5, 9, 12, 24, 34]
        //    System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //    should print [34, 24, 12, 9, 5]
        int[] numbers = new int[] {34, 12, 24, 9, 5};
        Integer[] bubbledNumbers = bubble(numbers);
        Integer[] advancedBubbledNumbersTrue = advancedBubble(numbers, true);
        Integer[] advancedBubbledNumbersFalse = advancedBubble(numbers, false);
        System.out.println(Arrays.toString(bubbledNumbers));
        System.out.println();
        System.out.println(Arrays.toString(advancedBubbledNumbersTrue));
        System.out.println();
        System.out.println(Arrays.toString(advancedBubbledNumbersFalse));
        System.out.println();
    }

    public static Integer[] bubble(int[] numbers) {
        TreeSet<Integer> treeSetOfNumbers = new TreeSet<>();
        for(Integer n : numbers) {
            treeSetOfNumbers.add(n);
        }
        return treeSetOfNumbers.toArray(new Integer[0]);
    }

    public static Integer[] advancedBubble(int[] numbers, Boolean b) {
        TreeSet<Integer> treeSetOfNumbers = new TreeSet<>();
        for(Integer n : numbers) {
            treeSetOfNumbers.add(n);
        }
        if(b) {
            return treeSetOfNumbers.descendingSet().toArray(new Integer[0]);
        } else {
            return treeSetOfNumbers.toArray(new Integer[0]);
        }

    }
}
