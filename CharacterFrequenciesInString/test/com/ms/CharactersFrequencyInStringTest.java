package com.ms;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CharactersFrequencyInStringTest {

  @Test
  void countCharacterFrequenciesTest() {
    String string = "Singed by it, pulled around of my blazening\n" +
        "(pulled round)\n" +
        "Eyes on the usually science of cherry-colored\n" +
        "(trousers)\n" +
        "Limelight not the music it's plain as as can be so\n" +
        "(tighter)";
    Map<String, Long> frequencyMap = CharactersFrequencyInString.countCharacterFrequencies(string);
    assertEquals(10, frequencyMap.get("i"));
    assertEquals(30, frequencyMap.size());

  }
}