package com.ms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonWord {

  public static void MostCommonWord(String[] args) {
    // Create a function called mostCommonWord that takes a string as an input, and returns the most common word in it.
    //If there are more than one most common word in the string, return only one of them.
    String inputString = "apple pear banana apple apple pear";
    System.out.println(findMostFrequentWord(inputString));

  }

  public static String findMostFrequentWord(String s) {
    String[] words = s.split(" ");
    List<String> wordsList = new ArrayList<>(Arrays.asList(words));
    Map<String, Long> mapFrequency = wordsList.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    Long max = 0L;
    String mostFrequentWord = "";
    for(Map.Entry<String, Long> entry : mapFrequency.entrySet()) {
      if(entry.getValue() > max) {
        max = entry.getValue();
        mostFrequentWord = entry.getKey();
      }
    }
    return mostFrequentWord;

  }
}

