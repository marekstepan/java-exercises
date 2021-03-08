package com.ms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CharacterConcatenation {

    public static void main(String[] args) {
	// Write a Stream Expression to concatenate a Character list to a string!
        List<Character> characters = Arrays.asList('e', 'r', 'y', 't', 'h', 'r', 'i', 'n', 'e');
        System.out.println(concatenateCharacters(characters));
    }

    public static String concatenateCharacters(List<Character> characters) {
        String concatenatedCharacters = characters.stream()
            .map(c -> c.toString())
            .collect(Collectors.joining());
        return concatenatedCharacters;
    }
}
