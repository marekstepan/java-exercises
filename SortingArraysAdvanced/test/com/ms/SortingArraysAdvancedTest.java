package com.ms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortingArraysAdvancedTest {

  @Test
  void bubbleTest() {
    int[] numbers = new int[] {1500, 12, 1000, 9, 1};
    Integer[] bubbledNumbersExpected = new Integer[] {1, 9, 12, 1000, 1500};
    Integer[] bubbledNumbers = SortingArraysAdvanced.bubble(numbers);
    assertTrue(Arrays.equals(bubbledNumbers, bubbledNumbersExpected));

  }

  @Test
  void advancedBubbleTest() {
    int[] numbers = new int[] {1500, 12, 1000, 9, 1};
    Integer[] advancedBubbledNumbersFalseExpected = new Integer[] {1, 9, 12, 1000, 1500};
    Integer[] advancedBubbledNumbersFalse = SortingArraysAdvanced.advancedBubble(numbers, false);
    assertTrue(Arrays.equals(advancedBubbledNumbersFalse, advancedBubbledNumbersFalseExpected));
    Integer[] advancedBubbledNumbersTrueExpected = new Integer[] {1500, 1000, 12, 9, 1};
    Integer[] advancedBubbledNumbersTrue = SortingArraysAdvanced.advancedBubble(numbers, true);
    assertTrue(Arrays.equals(advancedBubbledNumbersTrue, advancedBubbledNumbersTrueExpected));
  }
}