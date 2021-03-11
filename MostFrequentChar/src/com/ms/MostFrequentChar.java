package com.ms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentChar {

    public static void main(String[] args) {
	// How to find the maximum occurring character in given String?
        String s = "I do not know which character is the most frequent here. Zzzzzz.";
        System.out.println(findMostFrequentChar(s));
    }

    public static List<Character> findMostFrequentChar(String s) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        List<Character> mostFrequentChars = new ArrayList<>();
        char[] charArray = s.toLowerCase().toCharArray();
        int max = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(Character.isAlphabetic(charArray[i])) {
                if(charMap.containsKey(charArray[i])) {
                    if (max <= charMap.get(charArray[i])) {
                        max = charMap.get(charArray[i]) + 1;
                    }
                    charMap.put(charArray[i], charMap.get(charArray[i]) + 1);
                } else {
                    if(max == 0) {
                        max = 1;
                    }
                    charMap.put(charArray[i], 1);
                }
            }
        }
        for(Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if(entry.getValue() == max) {
                mostFrequentChars.add(entry.getKey());
            }
        }
        return mostFrequentChars;
    }
}
