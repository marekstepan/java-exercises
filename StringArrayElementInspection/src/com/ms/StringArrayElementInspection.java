package com.ms;

public class StringArrayElementInspection {

    public static void main(String[] args) {
	// Create a function that takes a string and a list of string as a parameter
        //Returns the index of the string in the list where the first string is part of
        //Only need to find the first occurrence and return the index of that
        //Returns `-1` if the string is not part any of the strings in the list
        //    Example
        //    String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};
        //    System.out.println(subStrList("ching", searchArr));
        //    should print: `4`
        //    System.out.println(subStrList("not", searchArr));
        //    should print: `-1`
        String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};
        System.out.println(subStrList("ching", searchArr));
        System.out.println(subStrList("not", searchArr));

    }

    public static int subStrList(String substring, String[] searchArr) {
        for (int i = 0; i < searchArr.length; i++) {
            if (searchArr[i].contains(substring)) {
                return i;
            }
        }
        return -1;
    }
}
