package com.ms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CharacterConcatenationTest {

  @Test
  void concatenateCharactersTest() {
    List<Character> characters = Arrays.asList('s', 't', 'r', 'i', 'n', 'g');
    assertEquals("string", CharacterConcatenation.concatenateCharacters(characters));
  }
}