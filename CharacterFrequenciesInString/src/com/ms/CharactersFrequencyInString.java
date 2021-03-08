package com.ms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharactersFrequencyInString {

    public static void main(String[] args) {
	// Write a Stream Expression to find the frequency of characters in a given string!
        String string = "Now gillyflower, chamomile, lavender\n" +
            "Elder, king-cup, orchis, sloe\n" +
            "Elder, king-cup, orchis, sloe";
        System.out.println(countCharacterFrequencies(string));
    }

    public static Map<String, Long> countCharacterFrequencies(String string) {
        Map<String, Long> charactersFrequencyMap = Stream.of(string.split(""))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return charactersFrequencyMap;
    }
}
