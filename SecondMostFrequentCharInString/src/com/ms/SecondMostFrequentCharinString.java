package com.ms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class SecondMostFrequentCharinString {

    public static void main(String[] args) {
        String string = "I'm in this song\n" +
            "So see and hear\n" +
            "Sultitan itan\n" +
            "So see and hear\n" +
            "Plain tiger iger";

        System.out.println(getSecondMostFrequent(string));
    }

    public static List<Character> getSecondMostFrequent(String string) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char c : string.toLowerCase().toCharArray()) {
            if(Character.isAlphabetic(c)) {
                if (!hashMap.containsKey(c)) {
                    hashMap.put(c, 1);
                } else {
                    hashMap.put(c, hashMap.get(c) + 1);
                }
            } else {
                continue;
            }
        }
        Integer[] valuesArray = hashMap.values().toArray(new Integer[hashMap.size()]);
        HashSet<Integer> valuesSet = new HashSet<>();
        valuesSet.addAll(Arrays.asList(valuesArray));
        List<Character> outputChars = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue().equals(valuesSet.toArray()[valuesSet.size()-2])) {
                outputChars.add(entry.getKey());
            }
        }
        return outputChars;
    }
}
