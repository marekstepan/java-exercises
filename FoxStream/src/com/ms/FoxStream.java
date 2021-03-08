package com.ms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FoxStream {

    public static void main(String[] args) {
        // Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:
        //Write a Stream Expression to find the foxes with green color!
        //Write a Stream Expression to find the foxes with green color, and age less then 5 years!
        //Write a Stream Expression to find the frequency of foxes by color!
        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Agata", "green", 5));
        foxes.add(new Fox("Tududu", "green", 7));
        foxes.add(new Fox("Hulala", "blue", 3));
        foxes.add(new Fox("Ououou", "pink", 6));
        foxes.add(new Fox("Ayayay", "orange", 10));
        foxes.add(new Fox("Brumbrum", "blue", 15));
        foxes.add(new Fox("Fifi", "green", 2));
        foxes.add(new Fox("Yupetee", "orange", 6));
        foxes.add(new Fox("Neveem", "blue", 3));
        foxes.add(new Fox("Sky", "blue", 1));

        for(Fox f : listGreenFoxes(foxes)) {
            System.out.println(f.getName());
        }

        System.out.println();

        for(Fox f : listYoungGreenFoxes(foxes)) {
            System.out.println(f.getName());
        }

        System.out.println();

        System.out.println(foxColorFrequencyMap(foxes));
    }

    public static List<Fox> listGreenFoxes(List<Fox> foxes) {
        return foxes.stream()
            .filter(f -> f.getColor().equals("green"))
            .collect(Collectors.toList());
    }

    public static List<Fox> listYoungGreenFoxes(List<Fox> foxes) {
        return foxes.stream()
            .filter(f -> f.getColor().equals("green") && f.getAge() < 5)
            .collect(Collectors.toList());
    }

    public static Map<String, Long> foxColorFrequencyMap(List<Fox> foxes) {
        return foxes.stream()
            .collect(Collectors.groupingBy(Fox::getColor, Collectors.counting()));
    }
}
