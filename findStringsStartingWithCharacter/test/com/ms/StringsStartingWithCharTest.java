package com.ms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringsStartingWithCharTest {

  @Test
  void getStringsStartingWitchCharTest() {
    List<String> names = Arrays.asList("Marek", "Danae", "Tibi", "Mari", "Heli");
    char startsWith = 'D';
    List<String> namesStartingWithD = Arrays.asList("Danae");
    assertEquals(namesStartingWithD, StringsStartingWithChar.getStringsStartingWitchChar(names, startsWith));
  }
}