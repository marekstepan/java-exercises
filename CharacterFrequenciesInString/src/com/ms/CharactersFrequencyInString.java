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
        String string2 ="Singed by it, pulled around of my blazening\n" +
            "(pulled round)\n" +
            "Eyes on the usually science of cherry-colored\n" +
            "(trousers)\n" +
            "Limelight not the music it's plain as as can be so\n" +
            "(tighter)";
        System.out.println(countCharacterFrequencies(string2));
    }

    public static Map<String, Long> countCharacterFrequencies(String string) {
        Map<String, Long> charactersFrequencyMap = Stream.of(string.split(""))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return charactersFrequencyMap;
    }
}
