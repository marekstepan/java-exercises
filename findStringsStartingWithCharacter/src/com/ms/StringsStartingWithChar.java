package com.ms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsStartingWithChar {

    public static void main(String[] args) {
	// Write a Stream Expression to find the strings which starts with a given letter(as parameter),
    // in the following list:
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI",
            "AMSTERDAM", "ABU DHABI", "PARIS");
        char startsWithChar = 'A';
        System.out.println(getStringsStartingWitchChar(cities, startsWithChar));

    }

    public static List<String> getStringsStartingWitchChar(List<String> strings, char startsWithChar) {
        List<String> stringsStartingBySelectedChar = strings.stream()
            .filter(s -> s.startsWith(String.valueOf(startsWithChar)))
            .collect(Collectors.toList());
        return stringsStartingBySelectedChar;
    }
}
