package com.ms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FoxStreamTest {

  @Test
  void listGreenFoxes() {
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
    List<Fox> greenFoxes = FoxStream.listGreenFoxes(foxes);
    assertTrue(greenFoxes.size() == 3);
    assertTrue(greenFoxes.stream()
        .anyMatch(fox -> fox.getName() == "Agata"));
  }

  @Test
  void listYoungGreenFoxes() {
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
    List<Fox> youngGreenFoxes = FoxStream.listYoungGreenFoxes(foxes);
    assertTrue(youngGreenFoxes.size() == 1);
    assertTrue(youngGreenFoxes.stream()
        .anyMatch(fox -> fox.getName() == "Fifi"));
  }

  @Test
  void foxColorFrequencyMap() {
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
    Map<String, Long> foxColorFrequencyMap = FoxStream.foxColorFrequencyMap(foxes);
    assertTrue(foxColorFrequencyMap.size() == 4);
    assertTrue(foxColorFrequencyMap.get("orange") == 2);
  }
}