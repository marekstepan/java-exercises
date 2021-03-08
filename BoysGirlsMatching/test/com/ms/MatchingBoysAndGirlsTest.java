package com.ms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MatchingBoysAndGirlsTest {

  @Test
  void makingMatchesTest() {
    List<String> girls = new ArrayList<>(Arrays.asList("Honeybunny","Ashley","Claire","Kat","Jane"));
    List<String> boys = new ArrayList<> (Arrays.asList("Pumpkin","Fred","Tom"));
    List<String> matched = MatchingBoysAndGirls.makingMatches(girls, boys);
    List<String> expectedMatchedList = new ArrayList<>((Arrays.asList("Honeybunny","Pumpkin","Ashley","Fred",
        "Claire","Tom","Kat","Jane")));
    assertArrayEquals(expectedMatchedList.toArray(new String[0]), matched.toArray(new String[0]));

  }
}