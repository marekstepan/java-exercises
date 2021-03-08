package com.ms;

public class IndexOfSubstringStart {

    public static void main(String[] args) {
	// Create a function that takes two strings as a parameter
        //Returns the starting index where the second one is starting in the first one
        //Returns `-1` if the second string is not in the first one
        //    Example:
        //    should print: `17`
        //    System.out.println(subStr("this is what I'm searching in", "searching"));
        //    should print: `-1`
        //    System.out.println(subStr("this is what I'm searching in", "not"));
        String string = "this is what I'm searching in";
        String substring1 = "searching";
        String substring2 = "not";
        System.out.println(subStr(string, substring1));
        System.out.println(subStr(string, substring2));
    }

    public static int subStr(String string, String substring) {
        if(!string.contains(substring)) {
            return -1;
        } else {
            return string.indexOf(substring);
        }
    }
}
