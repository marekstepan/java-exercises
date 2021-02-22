package com.ms;

import java.util.ArrayList;
import java.util.List;

public class UniqueLettersInString {

    public static void main(String[] args) {
        String string = "Today love finds off little\n" +
            "You see your singing is so vague\n" +
            "His joined her love so little\n" +
            "Don't care if you're fickle, oh that I find";
        System.out.println(getOnlyUniqueLetters(string));
    }

    public static List<Character> getOnlyUniqueLetters(String string) {
        List<Character> uniques = new ArrayList<>();
        String stringUpperCase = string.toUpperCase();
        for(char c : stringUpperCase.toCharArray()) {
            if(!uniques.contains(c) && Character.isAlphabetic(c)) {
                uniques.add(c);
            }
        }
        return uniques;
    }
}
