package com.ms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniqueLettersInStringTest {

  @Test
  void getOnlyUniqueLetters() {
    String string = "Pearly-dewdrops’ drops";
    List<Character> expectedList = new ArrayList<>();
    expectedList.addAll(Arrays.asList('P', 'E', 'A', 'R', 'L', 'Y', 'D', 'W', 'O', 'S'));
    assertEquals(expectedList, UniqueLettersInString.getOnlyUniqueLetters(string));
  }
}