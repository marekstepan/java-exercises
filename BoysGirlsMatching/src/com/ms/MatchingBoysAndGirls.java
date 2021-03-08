package com.ms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchingBoysAndGirls {

    public static void main(String[] args) {
	// Write a method that joins the two lists by matching one girl with one boy into a new list
        //If someone has no pair, he/she should be the element of the list too
        //Expected output: "Eve", "Joe", "Ashley", "Fred"...
        //ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        //ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"))
        //System.out.println(makingMatches(girls, boys));
        List<String> girls = new ArrayList<> (Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        List<String> boys = new ArrayList<> (Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));
        List<String> matchedList = makingMatches(girls, boys);
        System.out.println(matchedList);
    }

    public static List<String> makingMatches(List<String> girls, List<String> boys) {
        int biggerListLength = Math.max(girls.size(), boys.size());
        List<String> matchedList = new ArrayList<>();
        for (int i = 0; i < biggerListLength; i++) {
            if(i < girls.size()) {
                matchedList.add(girls.get(i));
            } else {
                continue;
            }
            if(i < boys.size()) {
                matchedList.add(boys.get(i));
            }
        }
        return matchedList;
    }
}
